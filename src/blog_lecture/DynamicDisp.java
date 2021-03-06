package blog_lecture;

public class DynamicDisp {
    static abstract class Service {
        abstract void run();
    }

    static class MyService1 extends Service {
        @Override
        void run() {
            System.out.println("run1");
        }
    }

    static class MyService2 extends Service {
        @Override
        void run() {
            System.out.println("run2");
        }
    }

    public static void main(String[] args) {
        Service svc = new MyService1();

        svc.run();

        svc = new MyService2();

        svc.run();
    }
}