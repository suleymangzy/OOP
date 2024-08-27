
public class Main {
    public static void main(String[] args) {
        Time time = new Time();
        Time time1 = new Time(16, 21, 49);
        time.forward(15620);
        time1.forward();
        time.timePrinting();
        time1.timePrinting();
    }
}