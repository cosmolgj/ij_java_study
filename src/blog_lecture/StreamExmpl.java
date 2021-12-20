package blog_lecture;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamExmpl {
    public static void main(String[] args) {
        String[] strArray = {"Gildong-Hone", "Shunshin-Lee", "Kkukjung-Lim"};
        Stream<String> strStream = Arrays.stream(strArray);
        strStream.forEach(a -> System.out.println(a + ", "));
        System.out.println();
    }
}
