public abstract class StringedInstrument extends Instrument {
    /**
     * Parameterized constructor.
     * @param instrumentName parameter variable holding the name of the instrument.
     */
    public StringedInstrument(String instrumentName) {
        super(instrumentName);
    }

    /**
     * Object method specific to StringedInstrument.
     */
    public void compression() {
        System.out.println("Compression...");
    }
}