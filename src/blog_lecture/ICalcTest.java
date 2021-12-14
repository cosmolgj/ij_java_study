package blog_lecture;

interface ICalculator {
    int add(int x, int y);
    int sub(int x, int y);

    default int mul(int x, int y) {
        return x * y;
    }

    static void print(int value) {
        System.out.println(value);
    }
}

class Calculator implements ICalculator {
    public int add(int x, int y) {
        return x + y;
    }
    public int sub(int x, int y) {
        return x - y;
    }
}

public class ICalcTest {
    public static void main(String[] args) {
        ICalculator cal = new Calculator();
        ICalculator.print(100);
    }
}
