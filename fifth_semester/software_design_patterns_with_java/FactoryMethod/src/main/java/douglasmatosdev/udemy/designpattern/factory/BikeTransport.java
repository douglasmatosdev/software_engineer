package douglasmatosdev.udemy.designpattern.factory;


import douglasmatosdev.udemy.designpattern.factory.vehicle.Bike;
import douglasmatosdev.udemy.designpattern.factory.vehicle.IVehicle;

public class BikeTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Bike();
    }
}
