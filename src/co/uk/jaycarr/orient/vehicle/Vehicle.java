package co.uk.jaycarr.orient.vehicle;

/**
 * An abstraction of a vehicle used for transport.
 *
 * @author Jay Carr
 */
public abstract class Vehicle {

    /**
     * Represents the type of vehicle.
     */
    private final VehicleType type;

    /**
     * The speedometer of the car. This can represent
     * aggregation.
     */
    private Speedometer speedometer;

    public Vehicle(VehicleType type, int maxSpeed) {
        this.type = type;
        this.speedometer = new Speedometer(maxSpeed);
    }

    public VehicleType getType() {
        return type;
    }

    public Speedometer getSpeedometer() {
        return speedometer;
    }

    public void setSpeedometer(Speedometer speedometer) {
        this.speedometer = speedometer;
    }
}