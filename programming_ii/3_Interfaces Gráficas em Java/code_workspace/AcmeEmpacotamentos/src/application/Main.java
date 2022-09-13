/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package application;

/**
 *
 * @author dsilva
 */
public class Main {

    //Atributo
    private static Empresa ACME;

    //Métodos
    public static void main(String args[]) throws InterruptedException {
        // Empresa (número de fitas, empregados disponíveis, número máximo de equipes, produtos a serem empacotados)
        ACME = new Empresa(20, 25, 4, 200);
    }

}
