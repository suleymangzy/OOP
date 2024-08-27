
public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        bicycle.setNumberOfWheels(2);
        bicycle.setForward(8);
        Bicycle.bicycleStatusInformation(bicycle);
    }
}