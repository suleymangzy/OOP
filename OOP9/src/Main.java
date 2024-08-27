// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Creating an object of Tuba using the Instrument interface reference
        Instrument instrument = new Tuba();
        instrument.playAnInstrument();

        // Since the Instrument interface doesn't have the breath method,
        // we need to cast it to the WindInstrument interface to access it
        WindInstrument windInstrument = (WindInstrument) instrument;
        windInstrument.breath();

        // Creating an object of Violin using the Instrument interface reference
        instrument = new Violin();
        instrument.playAnInstrument();

        // Since the Instrument interface doesn't have the compression method,
        // we need to cast it to the StringedInstrument interface to access it
        StringedInstrument stringedInstrument = (StringedInstrument) instrument;
        stringedInstrument.compression();
    }
}