package blog_lecture;

public abstract class Animal {
    abstract void eat();
    abstract void sleep();
}

class Tiger extends Animal {
    @Override
    void eat() { System.out.println("eat"); }
    @Override
    void sleep() { System.out.println("sleep"); }

    void jump() { System.out.println("jump high"); }
}

class Eagle extends Animal {
    @Override
    void eat() { System.out.println("eat rogues"); }

    @Override
    void sleep() { System.out.println("sleep"); }

    void flying() { System.out.println("fly"); }

    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
        t.sleep();
        t.jump();
        System.out.println("-------------------------------------------");
        Eagle e = new Eagle();
        e.eat();
        e.sleep();
        e.flying();
    }
}
