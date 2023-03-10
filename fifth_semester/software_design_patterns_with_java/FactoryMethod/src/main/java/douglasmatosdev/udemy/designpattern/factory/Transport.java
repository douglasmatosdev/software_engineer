package douglasmatosdev.udemy.designpattern.factory;

import douglasmatosdev.udemy.designpattern.factory.vehicle.IVehicle;

public abstract class Transport {
    public void startTransport() {
        IVehicle vehicle = createTransport();
        vehicle.startRoute();
    }

    protected abstract IVehicle createTransport();
}
