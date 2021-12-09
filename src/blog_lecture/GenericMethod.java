package blog_lecture;

class ClassName2<E> {
    private E element;

    void set(E element) {
        this.element = element;
    }

    E get() {
        return element;
    }

    <T> T genericMethod(T o) {
        return o;
    }
}

public class GenericMethod {
    public static void main(String[] args) {
        ClassName2<String> a = new ClassName2<String>();
        ClassName2<Integer> b = new ClassName2<Integer>();

        a.set("10");
        b.set(10);

        System.out.println("a data : " + a.get());
        System.out.println("a E Type : " + a.get().getClass().getName());

        System.out.println();

        System.out.println("b data : " + b.get());
        System.out.println("b E Type : " + b.get().getClass().getName());

        System.out.println();

        System.out.println("<T> returnType : " + a.genericMethod(3).getClass().getName());
        System.out.println("<T> returnType : " + a.genericMethod("ABCD").getClass().getName());
        System.out.println("<T> returnType : " + a.genericMethod(b).getClass().getName());
    }
}
