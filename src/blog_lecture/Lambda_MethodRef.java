package blog_lecture;

import java.util.Optional;

class MyClass {
    int iv;

    MyClass() {}

    MyClass(int iv) {
        this.iv = iv;
    }
}

public class Lambda_MethodRef {
    public static void main(String[] args) {
        Function<String, Integer> f = Integer::parseInt;

        System.out.println(f.apply("100") + 200);

        Supplier<MyClass> s = MyClass::new;
        System.out.println(s.get());

        Function<Integer, MyClass> f2 = MyClass::new;
        MyClass m = f2.apply(100);
        System.out.println(m.iv);
        System.out.println(f2.apply(200).iv);

        Function<Integer, int[]> f3 = int[]::new;
        System.out.println(f3.apply(10).length);
    }
}
