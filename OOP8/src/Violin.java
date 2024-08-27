public class Violin extends StringedInstrument {
    /**
     * Parameterized constructor.
     * @param instrumentName parameter variable holding the name of the instrument.
     */
    public Violin(String instrumentName) {
        super(instrumentName);
    }

    /**
     * Concrete method created by overriding the inherited abstract method
     * from the abstract parent class.
     * Ensures polymorphism.
     */
    @Override
    public void playAnInstrument() {
        System.out.println(getInstrumentName() + " Sound...");
    }

    /**
     * Concrete method created in a subclass by overriding
     * the concrete method in the abstract parent class.
     * Optional polymorphism.
     */
    @Override
    public void compression() {
        System.out.println(getInstrumentName() + " Low Compression...");
    }
}

