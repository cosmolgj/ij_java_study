package blog_lecture;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedListTest {
    public static void main(String[] args) {
        ArrayList array = new ArrayList(2000000);
        LinkedList link = new LinkedList();

        System.out.println("======== add in order ========");
        System.out.println("ArrayList = " + addF(array));
        System.out.println("LinkedList = " + addF(link));

        System.out.println("\n============ add in mid ===========");
        System.out.println("ArrayList = " + addM(array));
        System.out.println("LinkedList = " + addM(link));

        System.out.println("\n=========== remove in mid ===========");
        System.out.println("ArrayList = " + removeM(array));
        System.out.println("LinkedList = " + removeM(link));

        System.out.println("\n============ remove in order ==========");
        System.out.println("ArrayList = " + removeF(array));
        System.out.println("LinkedList = " + removeF(link));
    }

    public static long addF(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list.add(i+"");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long addM(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.add(500, "X");
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long removeF(List list) {
        long start = System.currentTimeMillis();
        for (int i = list.size() - 1; i >=0; i--) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }

    public static long removeM(List list) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        return end - start;
    }
}
