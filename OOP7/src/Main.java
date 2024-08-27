
public class Main {
    public static void main(String[] args) {

        Instrument instrument = new Instrument();
        /**
         * First, a reference variable of type Instrument is defined.
         * An instance of the Instrument class is assigned to this reference variable.
         */
        instrument.playAnInstrument();
        /**
         * The playAnInstrument() method is called using this reference variable.
         * We expect the output “Sound...” to appear on the screen.
         */

        instrument = new Violin();
        /**
         * Next, a reference to a Violin object is assigned to the same reference variable.
         */
        instrument.playAnInstrument();
        /**
         * The playAnInstrument() method is called again using this reference variable.
         * Due to late binding: Although the reference variable is of type Instrument,
         * it points to an object of type Violin. At runtime, since the reference variable
         * points to a Violin object, the overridden method in the Violin class will be executed.
         * Thus, the output will be “Violin sound...”.
         */
    }
}