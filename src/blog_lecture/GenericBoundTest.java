package blog_lecture;

public class GenericBoundTest <T extends Number> {
    public void set(T t) {}

    public static void main(String[] args) {
        GenericBoundTest<Integer> genericbTest = new GenericBoundTest<>();

        genericbTest.set(100);
    }
}
