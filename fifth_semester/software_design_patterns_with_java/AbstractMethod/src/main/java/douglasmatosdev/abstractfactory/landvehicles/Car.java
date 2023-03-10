package douglasmatosdev.abstractfactory.landvehicles;

public class Car implements ILandVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando o trajeto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos os passageiros, estamos prontos");
    }
}
