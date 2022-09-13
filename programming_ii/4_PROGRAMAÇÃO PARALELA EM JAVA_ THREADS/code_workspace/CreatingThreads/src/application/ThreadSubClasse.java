/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

/**
 *
 * @author dsilva
 */
public class ThreadSubClasse extends Thread {
    long numero;

    public ThreadSubClasse(long numero) {
        this.numero = numero;
    }
    
    @Override
    public void run() {
        // Implementa o comportamento apropriado
    }
}
