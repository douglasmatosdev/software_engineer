package application;

import entities.Juridica;
import exceptions.ErroValidacaoCNPJ;

public class Main {
    public static void main(String[] args) throws ErroValidacaoCNPJ {

        Juridica juridica = new Juridica(
                "Mercado do Zé",
                "01/01/2020",
                "29.864.533/0001-01",
                "Rua dos bobos, n: 0",
                "Brasileira",
                "Rio de Janeiro");

        System.out.println("Tipo: " + juridica.retornaTipo());
        System.out.println(juridica);


        juridica.atualizarID("33.036.596/0001-39");


        System.out.println(juridica);
    }
}
