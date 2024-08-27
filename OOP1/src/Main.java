import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(); // An object named "student" is created.

        /*
         Methods defined according to the properties of the created object are called
         in the main method using object_name.method_name based on user interaction.
        */
        student.setNameAndSurname();
        student.displayOnScreen();
    }
}