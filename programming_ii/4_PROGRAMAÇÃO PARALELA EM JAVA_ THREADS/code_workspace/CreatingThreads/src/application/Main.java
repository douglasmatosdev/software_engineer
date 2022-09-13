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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Extensão de Thread
        ThreadSubClasse novaTSC = new ThreadSubClasse (200);
        novaTSC.start ();
        
        // Implementação de Runnable
        ThreadInterface novaTI = new ThreadInterface(200);
        new Thread ( novaTI ).start ();
    }
    
}
