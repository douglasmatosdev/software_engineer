/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package application;

import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

/**
 *
 * @author dsilva
 */
public class Equipe extends Thread {
    //Atributos

    private final int nr_integrantes;
    private CountDownLatch latch;
    private final Semaphore pool_fita;
    private final PoolProdutos pool_produtos;
    private final ArrayList< Empacotador> empacotadores;
    private final ContadorSinc prod_empacotados_eqp;

    //Métodos
    public Equipe(String nome, int nr_integrantes, Semaphore pool_fita, PoolProdutos pool_produtos) {
        this.setName(nome);
        this.nr_integrantes = nr_integrantes;
        this.pool_fita = pool_fita;
        this.pool_produtos = pool_produtos;
        this.empacotadores = new ArrayList< Empacotador>();
        prod_empacotados_eqp = new ContadorSinc(0);
        prepararEmpacotadores();
    }

    /**
     * Realiza atomicamente as operações de decremento do latch, incremento do
     * número de pacotes que a equipe empacotou e libera (uma) trava sobre o
     * semáforo "pool_fita".
     */
    public synchronized void liberarFita() {
        latch.countDown();
        prod_empacotados_eqp.incrementar();
        pool_fita.release();
    }

    /**
     * Realiza atomicamente as operações de decremento do latch e libera
     * "nr_travas" travas sobre o semáforo "pool_fita".
     */
    public synchronized void liberarFitasDesnecessarias(int nr_travas_liberadas) {
        pool_fita.release(nr_travas_liberadas);
        while (nr_travas_liberadas > 0) {
            latch.countDown();
            nr_travas_liberadas--;
        }
    }

    public synchronized int getEmpacotamentos() {
        return prod_empacotados_eqp.getContador();
    }

    public synchronized int getNrIntegrantes() {
        return nr_integrantes;
    }

    private void prepararEmpacotadores() {
        for (int i = 1; i <= nr_integrantes; i++) {
            Empacotador emp = new Empacotador(i, this);
            empacotadores.add(emp);
        }
    }

    /**
     * Para cada empregador, se houver pacote disponível para empacotar,
     * decrementa pool_pacotes, dispara uma thread (Empacotador) para realizar o
     * trabalho de empacotamento. Do contrário, não faz nada.
     *
     * @return Se for possível retirar um pacote para cada (Empacotador),
     * retorna true, caso contrário, retorna false.
     */
    private boolean empacotar(int nr_produtos) {
        Thread thd;
        int thd_criadas = pool_produtos.retirarProdutos(nr_produtos); //O número de threads a ser criado para empacotar é igual ao número de produtos retirados pela equipe.
        boolean controle;
        if (thd_criadas == 0) { //Não há produtos disponíveis para empacotamento.
            liberarFitasDesnecessarias(nr_produtos); //Devolve todas as fitas pegas.
            return false;
        } else {
            for (int i = 1; i <= thd_criadas; i++) {
                thd = new Thread(empacotadores.get(i - 1));
                thd.setPriority(Thread.currentThread().getPriority() + 2);
                thd.start(); //Inicia a thread (Empacotador).        
            }
            liberarFitasDesnecessarias(nr_produtos - thd_criadas); //Devolve todas as fitas excedentes.
            return bloquear(); //Bloqueia a thread (Equipe) até que os empacotadores terminem o trabalho.
        }
    }

    /**
     * Realiza o bloqueio da thread até que todas as threads (Empacotador)
     * tenham finalizado
     *
     * @return boolean
     */
    private boolean bloquear() {
        try {
            latch.await(); //Bloqueia a thread (Equipe) até que os empacotadores terminem o trabalho.
            return true;
        } catch (InterruptedException e) {
            e.printStackTrace();
            return false;
        }
    }

    private synchronized void relatar() {
        System.out.println("\n/----------------------------------------\\");
        System.out.println(getName() + " (thread: " + Thread.currentThread().getId() + ") FINALIZOU");
        System.out.println(" |- Nr Integrantes: " + this.nr_integrantes);
        System.out.println(" |- Empacotamentos da equipe: " + this.prod_empacotados_eqp.getContador());
        System.out.println(" |- Empacotamentos por integrante:");
        empacotadores.forEach((emp) -> emp.listarEmpacotamentos());
        System.out.println(" |- Threads por objeto Empacotador:");
        empacotadores.forEach((emp) -> emp.listarIdThreads());
        System.out.println("\\----------------------------------------/\n");
    }

    @Override
    public void run() {
        try {
            boolean controle;
            System.out.println(getName() + " PRONTA");
            do {
                pool_fita.acquire(nr_integrantes);
                this.latch = new CountDownLatch(nr_integrantes);
                controle = empacotar(nr_integrantes); //Cada integrante da equipe empacota um produto.
            } while (controle);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        relatar();
    }
}
