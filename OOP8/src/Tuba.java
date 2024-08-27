public class Tuba extends WindInstrument {
    /**
     * Parameterized constructor.
     * @param instrumentName parameter variable holding the name of the instrument.
     */
    public Tuba(String instrumentName) {
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
    public void breath() {
        System.out.println(getInstrumentName() + " Deep Breath...");
    }
}
