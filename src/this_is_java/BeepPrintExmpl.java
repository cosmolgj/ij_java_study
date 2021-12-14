package this_is_java;

import java.awt.*;

public class BeepPrintExmpl {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        for (int i = 0; i < 5; i++) {
            toolkit.beep();
            try { Thread.sleep(500); } catch (Exception e) {}
        }

        for (int i = 0;  i < 5; i++) {
            System.out.println("Ting");
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }
}
