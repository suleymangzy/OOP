
public class Main {
    public static void main(String[] args) {
        JavaBean javaBean = new JavaBean();
        JavaBean javaBean1 = new JavaBean("state");

        JavaBean.statusInformation(javaBean);
        JavaBean.statusInformation(javaBean1);
    }
}