package douglasmatosdev.abstractfactory.factories;

import douglasmatosdev.abstractfactory.aircrafts.Helicopter;
import douglasmatosdev.abstractfactory.aircrafts.IAircraft;
import douglasmatosdev.abstractfactory.landvehicles.ILandVehicle;
import douglasmatosdev.abstractfactory.landvehicles.Motorcycle;
import douglasmatosdev.abstractfactory.watervehicles.Boat;
import douglasmatosdev.abstractfactory.watervehicles.IWaterVehicles;

public class NineNienTransport implements ITransportFactory {
    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }

    @Override
    public IWaterVehicles createTransportWaterVehicles() {
        return new Boat();
    }
}
