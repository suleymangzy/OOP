public class Vehicle {
    /**
     * The "final" keyword is used to create
     * a constant variable whose value will not change.
     * Since the value of constant variables will not change,
     * it would be unreasonable to create these variables based
     * on the object's state.
     * Therefore, constant variables are created as class
     * variables with the help of the "static" keyword.
     * The names of constant variables are written in capital letters.
     */
    public final static String DRIVER = "Suleyman Guzey";

    /**
     * Variables qualified with the "protected" access specifier can be
     * accessed by both their own classes and subclasses derived from that class.
     */
    protected int forward;

    /**
     * Default constructor.
     */
    public Vehicle() {
        System.out.print("Vehicle -");
    }

    /**
     * The "set" method created to access the object variable defined with
     * the "protected" access specifier outside its own class and outside
     * a class derived from its class.
     * @param forward Variable that holds how many units the created object will advance.
     */
    public void setForward(int forward) {
        this.forward = forward;
    }
}
