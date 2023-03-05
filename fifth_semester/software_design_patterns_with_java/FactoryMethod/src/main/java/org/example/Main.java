package org.example;

import org.example.badsolution.BadSolution;
import org.example.badsolutiontoo.BadSolutionToo;
import org.example.nicesolution.NiceSolution;

/**
 * Author: Douglas Matos da Silva
 * Github: douglasmatosdev
 * Email: douglasmatosdev@gmail.com
 *
 * Permitir que um módulo possa criar objetos de uma hierarquia de classes,
 * chamando uma operação genérica definida em uma superclasse e deixando a
 * instanciação do objeto específico da hierarquia para
 * cada implementação dessa operação nas subclasses.
 *
 * É composta por uma hierarquia de classes que especializam um participante
 * abstrato Creator e por outra hierarquia de classes
 * que especializam um participante abstrato Product.
 */

public class Main {
    public static void main(String[] args) throws Exception {
        BadSolution.start();
        BadSolutionToo.start();
        NiceSolution.start();
    }
}