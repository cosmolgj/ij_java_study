package blog_lecture;

public class LikeCount {

    static int count;

    public LikeCount() {
        this.count++;
        System.out.println("like count : " + count);
    }

    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        LikeCount lc1 = new LikeCount();
        LikeCount lc2 = new LikeCount();

        System.out.println("total like count : " + LikeCount.getCount());
    }
}
