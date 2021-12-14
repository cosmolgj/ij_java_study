package blog_lecture;

interface Car {
    void carMethod();

    default void defaultCarMethod() {
        System.out.println("Default Car Method");

        privateCarMethod();
        privateStaticCarMethod();
    }

    private void privateCarMethod() {
        System.out.println("private car method");
    }

    private static void privateStaticCarMethod() {
        System.out.println("private static car method");
    }
}

class DefaultCar implements Car {
    @Override
    public void carMethod() {
        System.out.println("car method by DefaultCar");
    }
}

public class IDefaultCar {
    public static void main(String[] args) {
        DefaultCar car = new DefaultCar();

        car.carMethod();
        car.defaultCarMethod();
    }
}
