package blog_lecture;

import java.util.Objects;

interface Function<T, R> {
    R apply(T t);
/*
    default <V> Function<V, R> compose(Function<? Super V, ? extends T> before) {
        Objects.requireNonNull(before);
        return (V v) -> apply(before.apply(v));
    }

    default <V> Function<T, V> compose(Function<? Super R, ? extends V> after) {
        Objects.requireNonNull(after);
        return (T t) -> after.apply(after.apply(t));
    }
*/
    static <T> Function<T, T> identity() {
        return t -> t;
    }
}

public class IfLambda_Function {
    Function<Integer, Integer> multiply = (value) -> value * 2;
    Function<Integer, Integer> add = (value) -> value + 3;

//    Function<Integer, Integer> addThenMultiply = multiply.compose(add);
//    Integer result = addThenMultiply.apply(3);
//    System.out.println(result);
}
