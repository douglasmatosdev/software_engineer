package douglasmatosdev.abstractfactory.factories;

import douglasmatosdev.abstractfactory.aircrafts.IAircraft;
import douglasmatosdev.abstractfactory.landvehicles.ILandVehicle;
import douglasmatosdev.abstractfactory.watervehicles.IWaterVehicles;

public interface ITransportFactory {
    ILandVehicle createTransportVehicle();

    IAircraft createTransportAircraft();

    IWaterVehicles createTransportWaterVehicles();
}
