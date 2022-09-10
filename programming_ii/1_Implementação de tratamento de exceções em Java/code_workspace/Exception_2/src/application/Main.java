package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int indice;
        System.out.println("Informe um número inteiro.");
        indice = sc.nextInt();

        Chamador chamador = new Chamador();
        int value = chamador.invocaGetElemento(indice);

        System.out.println("\nValor " + value);

        sc.close();
    }
}

class Chamador {
    Arranjo arranjo = new Arranjo();

    int invocaGetElemento(int i) {
        return arranjo.getElemento(i);
    }
}

class Arranjo {
    int[] vetor = {1, 2, 3, 4};

    int getElemento(int i) {
        try {
            if (i < 0 || i > 3) {
                throw new IllegalAccessException();
            }
        } catch (Exception e) {
            System.out.println("ERRO: índice fora dos limites do vetor.");
        }

        return vetor[i];
    }
}