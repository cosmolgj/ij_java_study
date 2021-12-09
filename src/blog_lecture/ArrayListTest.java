package blog_lecture;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListTest {
    public static void main(String[] args) {
        System.out.println("[Array]");
        int[] arr = new int[5];
        arr[1] = 100;

        System.out.println(Arrays.toString(arr));

        System.out.println("\n[ArrayList]");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            System.out.println("Element : " + list.get(i));
        }
    }
}
