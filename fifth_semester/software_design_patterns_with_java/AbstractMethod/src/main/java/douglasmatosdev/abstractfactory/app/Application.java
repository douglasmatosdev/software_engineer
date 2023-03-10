package douglasmatosdev.abstractfactory.app;

import douglasmatosdev.abstractfactory.aircrafts.IAircraft;
import douglasmatosdev.abstractfactory.factories.ITransportFactory;
import douglasmatosdev.abstractfactory.landvehicles.ILandVehicle;
import douglasmatosdev.abstractfactory.watervehicles.IWaterVehicles;

public class Application {
    private ILandVehicle vehicle;
    private IAircraft aircraft;

    private IWaterVehicles waterVehicles;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
        waterVehicles = factory.createTransportWaterVehicles();
    }

    public void startRoute() {
        vehicle.startRoute();
        System.out.println("==============================================================================================");
        aircraft.startRoute();
        System.out.println("==============================================================================================");
        waterVehicles.startRoute();
    }
}
