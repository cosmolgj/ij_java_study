package blog_lecture;

public class StaticDisp {
    static class Service {
        void run(int number) {
            System.out.println("run(" + number + ")");
        }

        void run(String msg) {
            System.out.println("run(" + msg + ")");
        }
    }

    public static void main(String[] args) {
        new Service().run(1);
        new Service().run("static dispatch");
    }
}