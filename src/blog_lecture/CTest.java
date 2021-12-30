package blog_lecture;

public class CTest {

    // class field
    public static int ONE = 1;
    public static String TWO = "TWO";
    public static String FOUR;

    // const variant
    public static final int FIVE = 10;

    // static block
    static {
        FOUR = "Hello";
    }

    // instance field
    private int three;

    public CTest(int three) {
        this.three = three;
    }

    // class method
    public static int sum(int a, int b) {
        return a + b;
    }

    // instance method
    public int multiply(int a, int b) {
        return a * b;
    }

    public int getThree() {
        return three;
    }
}
