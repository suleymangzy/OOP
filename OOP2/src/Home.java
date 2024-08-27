public class Home {
    private String street;
    private String number;

    /*
     The "this" keyword is used as "this.member_variable_name = local_variable_name"
     to distinguish between local variables and member variables with the same name within a class in Java.
    */
    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void display() {
        System.out.println("Street: " + street + "\nNumber: " + number);
    }
}
