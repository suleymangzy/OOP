public class JavaBean {
    /**
     * Object variable that holds the state information of the created object.
     */
    private String statusInformation;

    /**
     * Default constructor for the object.
     */
    public JavaBean() {
        /**
         * Using the "this" keyword, the default constructor initializes the object
         * by calling the parameterized constructor with a null value.
         */
        this(null);
    }

    /**
     * Parameterized constructor for the object.
     * @param statusInformation Holds the state information of the object.
     */
    public JavaBean(String statusInformation) {
        this.statusInformation = statusInformation;
    }

    /**
     * Class method that prints the status information of the created object.
     * @param javaBean The variable name that holds the reference to the created object.
     */
    public static void statusInformation(JavaBean javaBean) {
        System.out.println("Status information: " + javaBean.statusInformation);
    }
}
