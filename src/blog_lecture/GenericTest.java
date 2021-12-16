package blog_lecture;

public class GenericTest <A, B, C> {
    private A first;
    private B second;
    private C third;

    public void setFirst(A first) {
        this.first = first;
    }

    public void setSecond(B second) {
        this.second = second;
    }

    public void setThird(C third) {
        this.third = third;
    }

    public void show() {
        System.out.println("Type A is : " + first.getClass().getTypeName());
        System.out.println("Type B is : " + second.getClass().getTypeName());
        System.out.println("Type C is : " + third.getClass().getTypeName());
    }

    public static void main(String[] args) {
        GenericTest<String, Integer, Double> genericTest = new GenericTest<>();
        genericTest.setFirst("hello");
        genericTest.setSecond(10);
        genericTest.setThird(10.0);

        genericTest.show();
    }
}
