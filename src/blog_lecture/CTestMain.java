package blog_lecture;

public class CTestMain {
    public static void main(String args[]) {
        int one     = CTest.ONE;
        String two  = CTest.TWO;
        int one_sum_two = CTest.sum(1, 2);

        CTest test = new CTest(3);
        int three = test.getThree();
        int two_multiply_three = test.multiply(2, 3);

        System.out.println("one : " + one);
        System.out.println("two : " + two);
        System.out.println("one_sum_two : " + one_sum_two);
        System.out.println("three : " + three);
        System.out.println("two_multiply_three : " + two_multiply_three);
        System.out.println("FOUR : " + CTest.FOUR);
        System.out.println("FIVE : " + CTest.FIVE);
    }
}
