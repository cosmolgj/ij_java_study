package blog_lecture;

import java.util.ArrayList;

class MyQueue {
    ArrayList<String> queue = new ArrayList<>();

    void enQueue(String data) {
        queue.add(data);
    }

    String deQueue() {
        if (queue.size() == 0) {
            return null;
        }

        return queue.remove(0);
    }
}
public class Queue {
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();

        queue.enQueue("0");
        queue.enQueue("1");
        queue.enQueue("2");

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}
