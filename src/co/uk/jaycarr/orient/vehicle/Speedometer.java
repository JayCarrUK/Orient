package co.uk.jaycarr.orient.vehicle;

/**
 * Represents the speedometer of the vehicle, used to
 * show how fast the vehicle is driving as well as other
 * details.
 *
 * @author Jay Carr
 */
public final class Speedometer {

    /**
     * Represents the maximum legal speed of the vehicle.
     */
    private final int maxSpeed;

    /**
     * Represents the current speed of the vehicle.
     */
    private int currentSpeed;

    public Speedometer(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    /**
     * Decelerates the vehicle by the specified amount.
     *
     * @param amount the amount of deceleration to apply
     */
    public void brake(int amount) {
        this.currentSpeed -= amount;
        this.checkSpeed();
    }

    /**
     * Accelerates the vehicle by the specified amount.
     *
     * @param amount the amount of acceleration to apply
     */
    public void accelerate(int amount) {
        this.currentSpeed += amount;
        this.checkSpeed();
    }

    /**
     * Ensures the speed does not go above the maximum
     * or minimum speed of the car.
     */
    private void checkSpeed() {
        if (this.currentSpeed >= this.maxSpeed) {
            this.currentSpeed = this.maxSpeed;
        } else if (this.currentSpeed < 0) {
            this.currentSpeed = 0;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }
}