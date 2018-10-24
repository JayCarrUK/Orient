package co.uk.jaycarr.orient.vehicle.type;

import co.uk.jaycarr.orient.vehicle.Vehicle;
import co.uk.jaycarr.orient.vehicle.VehicleType;

/**
 * A bus representation whereby the generic features
 * are inherited from {@link Vehicle}.
 *
 * @author Jay Carr
 */
public final class Bus extends Vehicle {

    /**
     * Represents whether the stop button has
     * been pressed on the bus.
     */
    private boolean buttonPressed;

    public Bus() {
        super(VehicleType.BUS, 50);
    }

    public boolean isButtonPressed() {
        return buttonPressed;
    }

    public void setButtonPressed(boolean buttonPressed) {
        this.buttonPressed = buttonPressed;
    }
}