package blog_lecture;

public class TargetThread extends Thread {
    @Override
    public void run() {
        for (long i = 0; i < 1000000000; i++) {}

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
