package blog_lecture;

public class DaemonExmpl implements Runnable {
    static boolean autoSave = false;

    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonExmpl());
        thread.setDaemon(true);
        thread.start();

        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
            if (i == 5) autoSave = true;
        }
        System.out.println("TERMINATED");
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3 * 1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (autoSave) autoSave();
        }
    }

    private void autoSave() {
        System.out.println("Working file saved automatically.");
    }
}
