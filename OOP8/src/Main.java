
public class Main {
    public static void main(String[] args) {
        Instrument instrument = new Tuba("Tuba1");
        instrument.playAnInstrument();
        // instrument.breath(); -> Cannot be accessed from the superclass reference.

        Tuba tuba = new Tuba("Tuba2");
        tuba.playAnInstrument();
        tuba.breath();

        instrument = new Violin("Violin1");
        instrument.playAnInstrument();
        // instrument.compression(); -> Cannot be accessed from the superclass reference.

        Violin violin = new Violin("Violin2");
        violin.playAnInstrument();
        violin.compression();
    }
}