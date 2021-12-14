package blog_lecture;

public class ObjUser {
    int id;
    String name;

    public ObjUser(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof ObjUser) {
            return this.getId() == ((ObjUser)obj).getId();
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ObjUser user1 = new ObjUser(10, "Gil-dong Hong");
        ObjUser user2 = new ObjUser(10, "Gil-dong Hong");

        System.out.println("user1.equals(user2): " + user1.equals(user2));
        System.out.println("user1.hashCode(): " + user1.hashCode());
        System.out.println("user2.hashCode(): " + user2.hashCode());
    }
}
