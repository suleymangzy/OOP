public class LandVehicle extends Vehicle {
    /**
     * Object variable defined as "protected".
     */
    protected int numberOfWheels;

    /**
     * Default constructor.
     */
    public LandVehicle() {
        super();
        System.out.print(" Land vehicle -");
    }

    /**
     * The "set" method created to access the object variable defined with
     * the "protected" access specifier from outside its own class and from
     * outside a class derived from its own class.
     * @param numberOfWheels Variable that holds the number of wheels entered
     * by the client for the created object.
     */
    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }
}

