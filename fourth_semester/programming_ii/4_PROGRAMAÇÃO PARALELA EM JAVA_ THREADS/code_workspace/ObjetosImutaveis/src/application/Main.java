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
        Aluno aluno = new Aluno("John doe", "11122233344", 1001);

        System.err.println("Nome: " + aluno.getNome());
        System.err.println("Cpf: " + aluno.getCPF());
        System.err.println("Matricula: " + aluno.getMatricula());

    }

}
