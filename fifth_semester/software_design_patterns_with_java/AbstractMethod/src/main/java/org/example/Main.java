package org.example;

public class Main {
    public static void main(String[] args) {

        ServicoIntegracaoWithoutFactory servicoIntegracao = new ServicoIntegracaoWithoutFactory();

        servicoIntegracao.registrarCliente("Cliente X", "X");
        servicoIntegracao.registrarConta("Conta X", "X");

        servicoIntegracao.registrarCliente("Cliente Y", "Y");
        servicoIntegracao.registrarConta("Conta Y", "Y");

        servicoIntegracao.registrarCliente("Cliente Z", "Z");
        servicoIntegracao.registrarConta("Conta Z", "Z");


        ServicoIntegracaoFactory servicoIntegracao2 = new ServicoIntegracaoFactory();

        servicoIntegracao2.registrarCliente("Clinte X", "X");
        servicoIntegracao2.registrarConta("Conta X", "X");

        servicoIntegracao2.registrarCliente("Clinte Y", "Y");
        servicoIntegracao2.registrarConta("Conta y", "y");

        servicoIntegracao2.registrarCliente("Clinte Z", "Z");
        servicoIntegracao2.registrarConta("Conta Z", "Z");
    }
}