package blog_lecture;

import java.util.ArrayList;

class MyStack {
    ArrayList<String> stack = new ArrayList<>();

    void push(String data) {
        stack.add(data);
    }

    String pop() {
        if (stack.size() == 0) {
            return null;
        }

        return stack.remove(stack.size() - 1);
    }
}

public class Stack {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push("0");
        stack.push("1");
        stack.push("2");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
