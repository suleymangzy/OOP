public interface Instrument {
    /**
     * Even if access specifiers and properties
     * of interface methods are not explicitly written, by default
     * they are public and abstract.
     * Therefore, these methods
     * must be implemented as public in the subclasses.
     * Interfaces do not hold state
     * (they cannot have object variables because they cannot create objects
     * and cannot be inherited).
     */
    void playAnInstrument();
}
