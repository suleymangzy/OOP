public class Main {
    public static void main(String[] args) {
        Home summerHouse = new Home();
        Home winterHome = new Home();

        /*
          The names of the objects we create are arbitrary expressions used to reference
          and access these objects. In other words, object names are "references"
          created to interact with the objects.
        */
        summerHouse.setStreet("4336");
        summerHouse.setNumber("5-3");
        winterHome.setStreet("4224");
        winterHome.setNumber("7");

        summerHouse.display();
        winterHome.display();

        // Swapping the addresses of summerHouse and winterHome
        winterHome.setStreet("4336");
        winterHome.setNumber("5-3");
        summerHouse.setStreet("4224");
        summerHouse.setNumber("7");

        winterHome.display();
        summerHouse.display();
    }
}