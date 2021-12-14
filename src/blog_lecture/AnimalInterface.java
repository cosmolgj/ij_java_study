package blog_lecture;

public interface AnimalInterface {
    void sound();
    String eat = "냠냠";
}

class Lion implements AnimalInterface {
    @Override
    public void sound() {
        System.out.println("크아앙");
        System.out.println("밥을 " + eat + " 먹는다.");
    }

    public static void main(String[] args) {
        Lion lion = new Lion();
        lion.sound();
    }
}

