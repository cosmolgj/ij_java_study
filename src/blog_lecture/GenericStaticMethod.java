package blog_lecture;

class ClassName3<E> {
    private E element;

    void set(E element) {
        this.element = element;
    }

    E get() {
        return element;
    }

    static <E> E genericMethod1(E o) {
        return o;
    }

    static <T> T genericMethod2(T o) {
        return o;
    }
}

public class GenericStaticMethod {
    public static void main(String[] args) {
        ClassName3<String> a = new ClassName3<String>();
        ClassName3<Integer> b = new ClassName3<Integer>();

        a.set("10");
        b.set(10);

        System.out.println("a data : " + a.get());
        System.out.println("a E Type : " + a.get().getClass().getName());

        System.out.println();

        System.out.println("b data : " + b.get());
        System.out.println("b E Type : " + b.get().getClass().getName());

        System.out.println();

        System.out.println("<E> returnType : " + ClassName3.genericMethod1(3).getClass().getName());
        System.out.println("<E> returnTYpe : " + ClassName3.genericMethod1("ABCD").getClass().getName());

        System.out.println("<T> returnType : " + ClassName3.genericMethod1(a).getClass().getName());
        System.out.println("<T> returnType : " + ClassName3.genericMethod1(3.0).getClass().getName());
    }
}
