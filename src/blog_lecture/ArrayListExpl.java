package blog_lecture;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExpl {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(1, 10);
        list.add(1);

        // print value
        for (Integer i : list)
            System.out.println(i);

        // print by Iterator
        Iterator iter = list.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println(list.contains(1));
        System.out.println(list.indexOf(1));
    }
}
