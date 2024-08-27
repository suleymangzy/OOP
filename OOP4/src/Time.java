public class Time {
    /**
     * Normally, in addition to seconds, the time object should have two more fields: hours and minutes.
     * However, due to the principle of encapsulation, the dependency on these additional fields has been removed
     * to prevent clients from directly modifying the object variables, avoiding invalid or inconsistent values,
     * and to reduce client dependence on these variables by using only the seconds variable.
     */

    private int seconds;

    /**
     * Initializes the object to 00:00:00.
     */
    public Time() {
        seconds = 0;
    }

    /**
     * Initializes the object to the given hour, minute, and second values.
     *
     * @param hr Initial hour value.
     * @param mn Initial minute value.
     * @param sc Initial second value.
     */
    public Time(int hr, int mn, int sc) {
        if (hr >= 0 && hr < 24) {
            seconds += hr * 3600;
        }
        if (mn >= 0 && mn < 60) {
            seconds += mn * 60;
        }
        if (sc >= 0 && sc < 60) {
            seconds += sc;
        }
    }

    /**
     * Advances the time by one second each time it is called.
     * Seconds cannot exceed 59, minutes cannot exceed 59, and hours cannot exceed 23.
     */
    public void forward() {
        seconds++;
    }

    /**
     * Advances the time by the specified number of seconds.
     *
     * @param sc Number of seconds to advance the time.
     */
    public void forward(int sc) {
        seconds += sc;
        if (seconds < 0) {
            seconds = 0;
        }
    }

    /**
     * Prints the current time to the console.
     */
    public void timePrinting() {
        int hour = seconds / 3600;
        int minute = (seconds / 60) % 60;
        System.out.println("Time: " + hour + ":" + minute + ":" + (seconds % 60));
    }
}
