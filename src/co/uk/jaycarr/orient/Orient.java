package co.uk.jaycarr.orient;

import co.uk.jaycarr.orient.vehicle.Speedometer;
import co.uk.jaycarr.orient.vehicle.Vehicle;
import co.uk.jaycarr.orient.vehicle.type.Bus;
import co.uk.jaycarr.orient.vehicle.type.Car;

/**
 * All uses are strictly from the 'vehicle' package.
 *
 * @author Jay Carr
 */
public final class Orient {

    public static void main(String[] args) {
        // The car is an sub-class of a Vehicle, therefore, it can be assigned to one.
        // Vehicle is an abstraction which represents all transport vehicles.
        Vehicle carVehicle = new Car();
        // Since we know carVehicle is a Car, we can now cast it to a Car.
        // This shows that the car can be referred to by different forms, which
        // shows forms of polymorphism.
        Car car = (Car) carVehicle;

        // Retrieves the max speed of the car from the speedometer.
        // The speedometer is used to represent aggregation.
        // The max speed is deeply encapsulated within the Speedometer.
        println("Car max speed: " + car.getSpeedometer().getMaxSpeed());

        // We can not accelerate the car and then brake it again.
        car.getSpeedometer().accelerate(5);

        // This is a reference to the speedometer of the car.
        Speedometer carSpeedometer = car.getSpeedometer();
        carSpeedometer.brake(5);

        // We can set the boot open state of the Car.
        car.setBootOpen(true);
        println("Car boot open: " + car.isBootOpen());

        // A bus is also a Vehicle, therefore, we can assign it to one.
        Vehicle busVehicle = new Bus();
        // All vehicles have a speedometer in this instance, so we can access it without casting.
        println("Bus max speed: " + busVehicle.getSpeedometer().getMaxSpeed());

        // But we cannot do this without being the field being an explicit Bus type.
        // busVehicle.setButtonPressed(true);

        // Now we can adjust the button pressed state.
        Bus bus = (Bus) busVehicle;
        bus.setButtonPressed(true);

        // Bring bus to a stand still for passenger if button pressed.
        if (bus.isButtonPressed()) {
            bus.getSpeedometer().brake(5);
            bus.setButtonPressed(false);
        }

        // The bus has received an upgrade and can now go up to 60 mph.
        bus.setSpeedometer(new Speedometer(60));
    }

    private static void println(String input) {
        System.out.println(input);
    }
}