package blog_lecture;

class ClassName_<K, V> {
    private K first;
    private V second;

    void set(K first, V second) {
        this.first = first;
        this.second = second;
    }

    K getFirst() {
        return first;
    }

    V getSecond() {
        return second;
    }
}

public class Generic2V {
    public static void main(String[] args) {
        ClassName_<String, Integer> a = new ClassName_<String, Integer>();

        a.set("10", 10);

        System.out.println("first data : " + a.getFirst());
        System.out.println("K Type : " + a.getFirst().getClass().getName());

        System.out.println("second data : " + a.getSecond());
        System.out.println("V Type : " + a.getSecond().getClass().getName());
    }
}
