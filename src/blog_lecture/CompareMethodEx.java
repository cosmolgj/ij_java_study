package blog_lecture;

class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}

class Util {
    public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2) {
        boolean keyCompare, valueCompare;

        keyCompare = p1.getKey().equals(p2.getKey());
        valueCompare = p1.getValue().equals(p2.getValue());

        return keyCompare && valueCompare;
    }
}

public class CompareMethodEx {
    public static void main(String[] args) {
        Pair<String, Integer> p1 = new Pair<String, Integer>("coco", 26);
        Pair<String, Integer> p2 = new Pair<>("coco", 26);

        boolean result = Util.compare(p1, p2);
        System.out.println(result);

        Pair<String, Integer> p3 = new Pair<>("coco", 26);
        Pair<String, Integer> p4 = new Pair<>("Jack", 30);

        result = Util.compare(p3, p4);
        System.out.println(result);
    }
}
