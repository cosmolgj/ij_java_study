package blog_lecture;

class Thread1 extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.print("-");
            for (int x = 0; x < 1000000000; x++);
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.print("|");
            for (int x = 0; x < 20; x++);
        }
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();

        thread1.setPriority(2);
        thread2.setPriority(7);

        System.out.println("Priority of thread1 (-) : " + thread1.getPriority());
        System.out.println("Priority of thread2 (|) : " + thread2.getPriority());

        thread1.start();
        thread2.start();
    }
}
