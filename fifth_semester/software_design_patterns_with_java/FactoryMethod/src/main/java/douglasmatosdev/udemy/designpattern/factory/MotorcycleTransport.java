package douglasmatosdev.udemy.designpattern.factory;

import douglasmatosdev.udemy.designpattern.factory.vehicle.IVehicle;
import douglasmatosdev.udemy.designpattern.factory.vehicle.Motorcycle;

public class MotorcycleTransport extends Transport {
    @Override
    protected IVehicle createTransport() {
        return new Motorcycle();
    }
}
