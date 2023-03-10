package douglasmatosdev.abstractfactory.factories;

import douglasmatosdev.abstractfactory.aircrafts.Airplane;
import douglasmatosdev.abstractfactory.aircrafts.IAircraft;
import douglasmatosdev.abstractfactory.landvehicles.Car;
import douglasmatosdev.abstractfactory.landvehicles.ILandVehicle;
import douglasmatosdev.abstractfactory.watervehicles.Boat;
import douglasmatosdev.abstractfactory.watervehicles.IWaterVehicles;

public class UberTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }

    @Override
    public IWaterVehicles createTransportWaterVehicles() {
        return new Boat();
    }
}
