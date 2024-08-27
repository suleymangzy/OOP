public class Tuba implements Instrument, WindInstrument {
    /**
     * Implements the method from the Instrument interface.
     */
    @Override
    public void playAnInstrument() {
        System.out.println("Tuba Sound...");
    }

    @Override
    public void breath() {
        System.out.println("Deep Breath...");
    }
}