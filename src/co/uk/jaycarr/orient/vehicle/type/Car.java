package co.uk.jaycarr.orient.vehicle.type;

import co.uk.jaycarr.orient.vehicle.Vehicle;
import co.uk.jaycarr.orient.vehicle.VehicleType;

/**
 * A car representation whereby the generic features
 * are inherited by {@link Vehicle}.
 *
 * @author Jay Carr
 */
public final class Car extends Vehicle {

    /**
     * Represents whether the car boot (storage space)
     * is open on the car.
     */
    private boolean bootOpen;

    public Car() {
        super(VehicleType.CAR, 70);
    }

    public boolean isBootOpen() {
        return bootOpen;
    }

    public void setBootOpen(boolean bootOpen) {
        this.bootOpen = bootOpen;
    }
}