package blog_lecture;

import java.util.EnumSet;

enum CarBrand {
    HYUNDAI, KIA, SSANGYONG, BENZ, AUDI, BMW
}

public class CarEnumSet {
    public static void main(String[] args) {
        EnumSet<CarBrand> carBrands = EnumSet.allOf(CarBrand.class);

        EnumSet<CarBrand> koreaBrand = EnumSet.of(CarBrand.HYUNDAI, CarBrand.KIA, CarBrand.SSANGYONG);

        EnumSet<CarBrand> germanyBrand = EnumSet.complementOf(koreaBrand);

        EnumSet<CarBrand> kia_Audi = EnumSet.range(CarBrand.KIA, CarBrand.AUDI);

        System.out.println(carBrands);
        System.out.println(koreaBrand);
        System.out.println(germanyBrand);
        System.out.println(kia_Audi);
    }
}
