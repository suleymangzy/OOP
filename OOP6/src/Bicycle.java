public class Bicycle extends NonMotorizedLandVehicle {
    /**
     * Default constructor.
     */
    public Bicycle() {
        super();
        System.out.print(" Bicycle.");
    }

    /**
     * A method that prints the status information of the created object.
     * @param bicycle Reference variable that holds information about the created object.
     */
    public static void bicycleStatusInformation(Bicycle bicycle) {
        System.out.print("\nYour bicycle has " + bicycle.numberOfWheels +
                " wheel(s) and driver " + Vehicle.DRIVER + ". " + bicycle.forward + " units are advancing...");
    }
}
