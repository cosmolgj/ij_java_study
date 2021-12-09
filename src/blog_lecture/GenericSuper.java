package blog_lecture;

//class SoltClass <E extends Comparable<E>> { }
class SoltClass <E extends Comparable<? super E>> {
}

abstract class Person {
    public abstract boolean equals(Person o);
}

class Student extends Person implements Comparable<Person> {
    @Override
    public int compareTo(Person o) {
        return 0;
    }

    @Override
    public boolean equals(Person o) {
        return true;
    }
}


public class GenericSuper {
    public static void main(String[] args) {
        SoltClass<Student> a = new SoltClass<Student>();
    }
}
