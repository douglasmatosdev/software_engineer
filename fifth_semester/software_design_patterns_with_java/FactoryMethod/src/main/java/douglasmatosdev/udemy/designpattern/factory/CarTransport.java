package douglasmatosdev.udemy.designpattern.factory;

import douglasmatosdev.udemy.designpattern.factory.vehicle.Car;
import douglasmatosdev.udemy.designpattern.factory.vehicle.IVehicle;

public class CarTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Car();
    }
}
