public abstract class WindInstrument extends Instrument {
    /**
     * Parameterized constructor.
     * @param instrumentName parameter variable holding the name of the instrument.
     */
    public WindInstrument(String instrumentName) {
        super(instrumentName);
    }

    /**
     * Object method specific to WindInstrument.
     */
    public void breath() {
        System.out.println("Breath...");
    }
}
