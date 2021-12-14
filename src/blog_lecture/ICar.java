package blog_lecture;

import java.util.Optional;

interface EchoMode {
    void EchoMode();
}

interface NormalMode {
    void NormalMode();
}

interface SportsMode {
    void SportsMode();
}

public class ICar implements EchoMode, SportsMode, NormalMode {
    @Override
    public void EchoMode() {
        System.out.println("drive Echo Mode");
    }

    @Override
    public void NormalMode() {
        System.out.println("drive Normal Mode");
    }

    @Override
    public void SportsMode() {
        System.out.println("drive Sports Mode");
    }
}
