package blog_lecture;

public class ExceptionThrowTest {
    static void callDriver() throws ClassNotFoundException {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("complete");
    }

    public static void main(String[] args) {

        try {
            callDriver();
        } catch (ClassNotFoundException e) {
            System.out.println("can't find class");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("System terminated.");
        }
    }
}
