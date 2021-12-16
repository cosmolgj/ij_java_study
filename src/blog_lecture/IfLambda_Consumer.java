package blog_lecture;

import java.util.Objects;

interface Supplier<T> {
    T get();
}

interface Consumer<T> {
    void accept(T t);

    default Consumer<T> andThen(Consumer<? super T> after) {
        Objects.requireNonNull(after);
        return (T t) -> { accept(t); after.accept(t); };
    }
}

public class IfLambda_Consumer {
    public static void main(String[] args) {
        Supplier<String> getString = () -> "Good morning!";
        String str = getString.get();
        System.out.println(str);

        Consumer<String> printString = text -> System.out.println("Help " + text + "!!");
        Consumer<String> printString2 = text -> System.out.println("--> Yes");
//		printString.accept("me");
        printString.andThen(printString2).accept("me");
    }
}
