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
public final class Aluno {
    //Atributos

    private final String nome;
    private final String CPF;
    private final int matricula;

    //Métodos
    protected Aluno(String nome, String CPF, int matricula) {
        this.nome = nome;
        this.CPF = CPF;
        this.matricula = matricula;
    }

    protected String getNome() {
        return this.nome;
    }

    protected String getCPF() {
        return this.CPF;
    }

    protected int getMatricula() {
        return this.matricula;
    }
}
