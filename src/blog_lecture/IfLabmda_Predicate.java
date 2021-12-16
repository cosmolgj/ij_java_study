package blog_lecture;

import java.util.Objects;
import java.util.Optional;

interface Predicate<T> {
    boolean test (T t);

    default Predicate<T> and(Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) && other.test(t);
    }

    default Predicate<T> negate() {
        return (t) -> !test(t);
    }

    default Predicate<T> or (Predicate<? super T> other) {
        Objects.requireNonNull(other);
        return (t) -> test(t) || other.test(t);
    }

    static <T> Predicate<T> isEqual(Object targetRef) {
        return (null == targetRef) ? Objects::isNull : object -> targetRef.equals(object);
    }
}

public class IfLabmda_Predicate {
    public static void main(String[] args) {
        Predicate<Integer> isBiggerThanFive = num -> num > 5;
        Predicate<Integer> isLowerThanSix = num -> num < 6;

        System.out.println("10 is bigger than 5? -> " + isBiggerThanFive.test(10));
        System.out.println(isBiggerThanFive.and(isLowerThanSix).test(10));
        System.out.println(isBiggerThanFive.or(isLowerThanSix).test(10));
    }
}
