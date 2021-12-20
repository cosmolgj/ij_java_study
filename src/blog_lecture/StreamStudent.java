package blog_lecture;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class SStudent {
    private String name;
    private int score;

    public SStudent(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() { return name; }
    public int getScore() { return score; }
}

public class StreamStudent {
    public static void main(String[] args) {
        List<SStudent> studentList = Arrays.asList(
                new SStudent("홍길동", 10),
                new SStudent("이순실", 20),
                new SStudent("임꺽정", 30)
        );

        Stream<SStudent> stream = studentList.stream();
        stream.forEach(s -> System.out.println("이름 : " + s.getName()));
    }
}
