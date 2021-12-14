package blog_lecture;

public class ObjClone implements Cloneable {
    private String name;
    private int age;

    public ObjClone(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "name : " + name + ", age : " + age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        ObjClone ocn = new ObjClone("Gil-dong Hong", 30);
        System.out.println(ocn);

        ObjClone ocn2 = (ObjClone) ocn.clone();
        System.out.println(ocn2);
    }
}
