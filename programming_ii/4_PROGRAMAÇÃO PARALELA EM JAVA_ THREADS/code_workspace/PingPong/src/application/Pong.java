/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

import java.util.concurrent.Semaphore;

/**
 *
 * @author dsilva
 */
public class Pong implements Runnable {
    //Atributos

    private Semaphore s1, s2;
    private Controle contador;

    //Métodos
    public Pong(Semaphore s1, Semaphore s2, Controle contador) {
        this.s1 = s1;
        this.s2 = s2;
        this.contador = contador;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread B (PONG) iniciada");
            while (contador.getControle() > 0) {
                s2.acquire();
                System.out.println("0 <= PONG");
                s1.release();
                contador.decrementa();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread B (PONG) terminada");
    }
}
