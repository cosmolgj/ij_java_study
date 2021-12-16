package blog_lecture;

import java.util.Optional;

public class Owner {
    public String brand;
    public int price;
    public CarType type;

    public static void main(String[] args) {
        Owner owner = new Owner();

        owner.brand = "hyundai";
        owner.price = 55_000_000;
        owner.type = CarType.SEDAN;
        System.out.println(owner.type.ordinal());

        System.out.println("brand name : " + owner.brand);
        System.out.println("car price : " + owner.price);
        System.out.println("car type : " + owner.type);

        CarType type_ = owner.type.SPORT;
        System.out.println(type_.ordinal());

        for (CarType type: CarType.values()) {
            System.out.println(type);
        }

        CarType type1 = CarType.SEDAN;
        CarType type2 = CarType.valueOf("SUV");

        System.out.println(type1);
        System.out.println(type2);

        int result1 = type1.compareTo(type2);
        int result2 = type2.compareTo(type1);

        System.out.println("result1 : " + result1);
        System.out.println("result2 : " + result2);
    }
}
