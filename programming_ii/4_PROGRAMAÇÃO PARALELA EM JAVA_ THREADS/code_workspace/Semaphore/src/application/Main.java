/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

import java.util.concurrent.Semaphore;

/**
 *
 * @author dsilva
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         // (...)
        Semaphore sem = new Semaphore ( 50 , true ); //Define até 50 acessos e o uso de FIFO
        sem.acquire ( ); //Solicita 1 acesso
        // Região crítica
        sem.release ( ); //Libera o acesso obtido
        //Código não crítico
        sem.acquire ( 4 ); //Solicita 4 acessos
        // Região crítica
        sem.release ( 4 ); //Libera os 4 acessos obtidos
        //Código não crítico
    }
    
}
