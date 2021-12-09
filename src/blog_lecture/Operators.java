package blog_lecture;

class AddNumber {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Operators {
    public static void main(String[] args) {
        AddNumber addNumber = new AddNumber();

        System.out.println(addNumber.add(2, 6));
        System.out.println(addNumber.add(2, 3, 4));
    }
}
