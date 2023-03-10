package douglasmatosdev.abstractfactory.watervehicles;

public class Boat implements IWaterVehicles {
    @Override
    public void startRoute() {
        wind();
        waves();
        getCargo();
        System.out.println("Iniciando a navegação!");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros, desatracando do cas!");
    }

    @Override
    public void wind() {
        System.out.println("Ventos a 23Km, Ventos OK!");
    }

    @Override
    public void waves() {
        System.out.println("Ondas de 0.5m, Ondas OK!");
    }
}
