package blog_lecture;

public class ThreadStateExmpl {
    public static void main(String[] args) {
        StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());

        statePrintThread.start();
    }
}
