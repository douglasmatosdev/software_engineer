/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package application;

/**
 *
 * @author dsilva
 */
//Classe
public class Controle {
    //Atributo

    private int contador = 0;

    //Métodos
    public Controle(int contador) {
        this.contador = contador;
    }

    public synchronized void decrementa() {
        this.contador--;
    }

    public synchronized int getControle() {
        return this.contador;
    }
}
