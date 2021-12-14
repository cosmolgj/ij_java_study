package blog_lecture;

import java.util.Optional;

public class ObjUser2 {
    int id;
    String name;

    public ObjUser2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ObjUser2) {
            return this.getId() == ((ObjUser2)obj).getId();
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return getId();
    }

    public  static void main(String[] args) {
        ObjUser2 user1 = new ObjUser2(10, "Gil-dong Hong");
        ObjUser2 user2 = new ObjUser2(10, "Gil-dong Hong");

        System.out.println("user1.equals(user2): " + user1.equals(user2));
        System.out.println("user1.hashCode(): " + user1.hashCode());
        System.out.println("user2.hashCode(): " + user2.hashCode());
        System.out.println("System.identifyHashCode(user1): " + System.identityHashCode(user1));
        System.out.println("System.identifyHashCode(user2): " + System.identityHashCode(user2));;
    }
}
