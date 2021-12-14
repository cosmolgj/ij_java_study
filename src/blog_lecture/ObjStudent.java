package blog_lecture;

public class ObjStudent {

    private String name;
    private int age;

    public ObjStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "name : " + name + ", age : " + age;
    }

    public static void main(String[] args) {
        ObjStudent std = new ObjStudent("Honggildong", 30);
        System.out.println(std);
    }
}
