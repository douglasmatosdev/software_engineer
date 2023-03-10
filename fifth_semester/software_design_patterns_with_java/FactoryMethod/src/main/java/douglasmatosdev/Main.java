package douglasmatosdev;

import douglasmatosdev.college.badsolution.BadSolution;
import douglasmatosdev.college.badsolutiontoo.BadSolutionToo;
import douglasmatosdev.college.nicesolution.NiceSolution;
import douglasmatosdev.udemy.designpattern.factory.BikeTransport;
import douglasmatosdev.udemy.designpattern.factory.CarTransport;
import douglasmatosdev.udemy.designpattern.factory.MotorcycleTransport;
import douglasmatosdev.udemy.designpattern.factory.Transport;

/**
 * Author: Douglas Matos da Silva
 * Github: douglasmatosdev
 * Email: douglasmatosdev@gmail.com
 * <p>
 * Permitir que um módulo possa criar objetos de uma hierarquia de classes,
 * chamando uma operação genérica definida em uma superclasse e deixando a
 * instanciação do objeto específico da hierarquia para
 * cada implementação dessa operação nas subclasses.
 * <p>
 * É composta por uma hierarquia de classes que especializam um participante
 * abstrato Creator e por outra hierarquia de classes
 * que especializam um participante abstrato Product.
 */

public class Main {
    private static Transport transport;

    public static void main(String[] args) throws Exception {
        /*
         *  These codes is based in Udemy course
         *
         * To run this program, click in tab Run -> Edit configurations...,
         * on the section "Build and run" fill the input "Program Arguments"
         * */

        configure(args[0]);
        if (transport != null) {
            runTransport();
        }


        /**
         These codes is based in college class

         BadSolution.start();
         BadSolutionToo.start();
         NiceSolution.start();
         */
    }

    private static void runTransport() {
        transport.startTransport();
    }

    private static void configure(String type) {
        switch (type) {
            case "uber":
                transport = new CarTransport();
                break;
            case "log":
                transport = new MotorcycleTransport();
                break;
            case "eats":
                transport = new BikeTransport();
                break;
        }
    }
}