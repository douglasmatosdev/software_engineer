package application;

import entities.Geometria;

public class Main {
    public static void main(String[] args) {
        Geometria geometria = new Geometria();

        //  Quadrado
        geometria.entradaDeDadosQuadrado();
        geometria.imprimirQuadrado();

        // Trapézio
         geometria.entradaDeDadosTrapezio();
         geometria.imprimirTrapezio();

        // Retângulo
        geometria.entradaDeDadosRetangulo();
        geometria.imprimirRetangulo();
    }

}
