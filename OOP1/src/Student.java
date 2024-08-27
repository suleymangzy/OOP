import java.util.Scanner;
public class Student {
    /*
    The "private" access modifier is used to protect the properties of the object
    from being directly accessed and modified from outside the class, preventing data inconsistencies.
   */
    private String firstName;
    private String lastName;

    public void setNameAndSurname() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the student's first name and last name.");
        System.out.print("First Name: ");
        firstName = input.next();
        System.out.print("Last Name: ");
        lastName = input.next();
    }

    public void displayOnScreen() {
        System.out.println(firstName + " " + lastName);
    }
}
