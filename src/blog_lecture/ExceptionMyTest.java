package blog_lecture;

class MyException extends Exception {
    public MyException() {
        super("exception i made");
    }
}

public class ExceptionMyTest {
    static void callException() throws MyException {
        throw new MyException();
    }

    public static void main(String[] args) {
        try {
            callException();
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("System terminated.");
        }
    }
}
