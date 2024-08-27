public abstract class Instrument {
    /**
     * Abstract classes can have object variables.
     */
    private String instrumentName;

    /**
     * Parameterized constructor.
     * Abstract classes can have constructors.
     * If not explicitly defined, a default constructor is used.
     * Even if no objects are created directly from an abstract class,
     * its constructors are executed when an object is created in a subclass.
     * @param instrumentName parameter variable holding the name of the instrument.
     */
    public Instrument(String instrumentName) {
        this.instrumentName = instrumentName;
    }
    /**
     * Abstract methods are declared without implementation.
     * They cannot be private or final.
     * No method body is needed for abstract methods.
     */
    public abstract void playAnInstrument();

    /**
     * Concrete methods can be included in abstract classes.
     * @return Returns the value of the object variable.
     */
    public String getInstrumentName() {
        return instrumentName;
    }
}
