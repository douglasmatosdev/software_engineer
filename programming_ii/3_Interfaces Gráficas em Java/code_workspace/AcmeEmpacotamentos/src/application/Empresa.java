/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 *
 * @author dsilva
 */
public class Empresa {
    //Atributos

    private final Semaphore pool_fita; //Controla o acesso ao recurso crítico (fitas).
    private final PoolProdutos pool_produtos; //Produtos a serem empacotados.
    private final ArrayList< Equipe> turno; //Conjunto de equipes de empacotadores. Cada equipe possui 2 ou mais empacotadores e corresponde a uma thread.
    private final int max_prod_empacotar; //Número máximo de produtos que serão empacotados.
    private final int pool_empacotadores; //Número de empacotadores disponíveis para formar as equipes. Cada empacotador também corresponde a uma thread.
    private final int nr_max_equipes; //Número máximo de equipes que podem ser formadas.
    private int prod_empacotados; //Número de produtos empacotados.

    //Métodos
    public Empresa(int nr_fitas, int pool_empacotadores, int nr_max_equipes, int max_prod_empacotar) throws InterruptedException {
        if ((nr_fitas < 1) || (pool_empacotadores < 2) || (nr_max_equipes < 1) || (max_prod_empacotar < 1)) {
            throw new IllegalArgumentException("Argumentos ilegais utilizados no construtor de Empresa.");
        } else {
            this.pool_fita = new Semaphore(nr_fitas);
            this.pool_empacotadores = pool_empacotadores;
            this.nr_max_equipes = nr_max_equipes;
            this.max_prod_empacotar = max_prod_empacotar;
            this.pool_produtos = new PoolProdutos(max_prod_empacotar);
            this.turno = new ArrayList< Equipe>();
            this.prod_empacotados = 0;
            criarEquipes(nr_fitas); //Monta as equipes alocando os empacotadores e armazenando as equipes em "turno".
            turno.forEach((eqp) -> eqp.start()); //Inicia todas as threads.
            for (Equipe eqp : turno) //Faz o join com todas as threads de equipe.
		try {
                eqp.join(); //A thread principal deve aguardar o fim de todas as threads Equipe para poder contabilizar os empacotamentos.
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for (Equipe eqp : turno) {
                prod_empacotados = prod_empacotados + eqp.getEmpacotamentos(); //Contabiliza o total de empacotamentos.
            }
            System.out.println("TOTAL DE EMPACOTAMENTOS: " + prod_empacotados);
        }
    }

    private void criarEquipes(int nr_fitas) {
        Equipe eqp;
        int nr_emp_eqp;
        int empacotadores_disponiveis = pool_empacotadores;
        int i = 1;
        do { //Cria as equipes com um número aleatório de integrantes e as adiciona em "turno".
            nr_emp_eqp = comporEquipe(empacotadores_disponiveis);
            if (nr_emp_eqp > nr_fitas) {
                nr_emp_eqp = nr_fitas; //Do contrário, teríamos mais solicitações de acesso do que o semáforo possui e a thread bloquearia eternamente.
            }
            eqp = new Equipe("Eqp[" + String.valueOf(i) + "]", nr_emp_eqp, pool_fita, pool_produtos);
            turno.add(eqp);
            empacotadores_disponiveis = empacotadores_disponiveis - nr_emp_eqp;
            i++;
        } while ((i < nr_max_equipes) && (empacotadores_disponiveis >= 2));
        /**
         * A última equipe recebe todos os empregados restantes. Se o número de
         * empregados for maior do que o número de fitas, são alocados nr_fitas
         * empregados (caso contrário, a equipe iria solicitar um número de
         * permissões superior ao número de recursos do semáforo e ficaria
         * bloqueada).
         */
        if (empacotadores_disponiveis > 0) {
            if (nr_fitas > empacotadores_disponiveis) {
                eqp = new Equipe("Eqp[" + String.valueOf(i) + "]", empacotadores_disponiveis, pool_fita, pool_produtos);
            } else {
                eqp = new Equipe("Eqp[" + String.valueOf(i) + "]", nr_fitas, pool_fita, pool_produtos);
            }
            turno.add(eqp);
        }
    }

    private final int comporEquipe(int empacotadores_disponiveis) {
        Random rnd = new Random();
        if (empacotadores_disponiveis > 2) {
            return rnd.nextInt(pool_empacotadores / nr_max_equipes) + 2;
        } else {
            return empacotadores_disponiveis;
        }
    }
}
