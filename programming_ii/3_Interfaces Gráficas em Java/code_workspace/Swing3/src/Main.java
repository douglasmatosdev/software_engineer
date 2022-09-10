import javax.swing.JOptionPane; 

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dsilva
 */
public class Main {
    public static void main(String[] args) {
        int a = new Integer(
                JOptionPane.showInputDialog("Primeiro Numero:"));
        int b = new Integer(
                JOptionPane.showInputDialog("Segundo Numero:"));
        int c = a + b;
        JOptionPane.showMessageDialog(null, "A soma será: "+c, 
                        "Soma", JOptionPane.INFORMATION_MESSAGE);
    }
}
