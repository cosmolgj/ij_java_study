package blog_lecture;

interface  IAnimal {
    void sound();
}

class Dog implements IAnimal {
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
    public void sleep() {
        System.out.println("새근새근 잡니다.");
    }
}

class Puma implements IAnimal {
    @Override
    public void sound() {
        System.out.println("크아앙");
    }
    public void hunting() {
        System.out.println("사냥을 합니다.");
    }
}

public class AnimalInterface2 {
    public static void main(String[] args) {
        IAnimal dog = new Dog();
        IAnimal puma = new Puma();

        dog.sound();
        puma.sound();;

        ((Dog)dog).sleep();
        ((Puma)puma).hunting();
    }
}
