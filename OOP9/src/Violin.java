public class Violin implements Instrument, StringedInstrument {
    /**
     * Implements the method from the Instrument interface.
     */
    @Override
    public void playAnInstrument() {
        System.out.println("Violin Sound...");
    }

    /**
     * Implements the method from the StringedInstrument interface.
     */
    @Override
    public void compression() {
        System.out.println("Low Compression...");
    }
}
