package douglasmatosdev;

import douglasmatosdev.abstractfactory.app.Application;
import douglasmatosdev.abstractfactory.enums.Company;
import douglasmatosdev.abstractfactory.factories.BoatTransport;
import douglasmatosdev.abstractfactory.factories.ITransportFactory;
import douglasmatosdev.abstractfactory.factories.NineNienTransport;
import douglasmatosdev.abstractfactory.factories.UberTransport;
import douglasmatosdev.college.ServicoIntegracaoFactory;
import douglasmatosdev.college.ServicoIntegracaoWithoutFactory;

import static douglasmatosdev.abstractfactory.enums.Company.*;

public class Main {

    public static Application configureApplication() {
        Application app;
        ITransportFactory factory = null;

        String input = "uber";
        Company company = Company.valueOf(input.toUpperCase());

        switch (company) {
            case UBER:
                factory = new UberTransport();
                break;
            case NINENINE:
                factory = new NineNienTransport();
                break;
            case BOAT:
                factory = new BoatTransport();
                break;
        }

        app = new Application(factory);

        return app;
    }

    public static void main(String[] args) {

        Application app = configureApplication();
        app.startRoute();

        /*
        * COLLEGE CODE

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
//        servicoIntegracao2.registrarConta("Conta y", "y");

        servicoIntegracao2.registrarCliente("Clinte Z", "Z");
        servicoIntegracao2.registrarConta("Conta Z", "Z");
                 */
    }
}