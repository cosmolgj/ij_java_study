package blog_lecture;

enum Color {
    RED, GREEN, BLUE;

    private Color() {
        System.out.println("Constructur called for : " + this.toString());
    }

    public void colorInfo() {
        System.out.println("Universal Color");
    }
}

public class CEnum {
    public static void main(String args[]) {
        Color color = Color.BLUE;

//        Color.BLUE.colorInfo();
        color.colorInfo();
    }
}
