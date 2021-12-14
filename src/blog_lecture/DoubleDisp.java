package blog_lecture;

import java.util.Arrays;
import java.util.List;

public class DoubleDisp {
    interface Post { void postOn(SNS sns); }

    static class Text implements Post {
        @Override
        public void postOn(SNS sns) {
            if (sns instanceof Facebook) {
                System.out.println("text - facebook");
            }
            if (sns instanceof Instagram) {
                System.out.println("text - Instagram");
            }
        }
    }

    static class Picture implements Post {
        @Override
        public void postOn(SNS sns) {
            if (sns instanceof Facebook) {
                System.out.println("picture - facebook");
            }
            if (sns instanceof Instagram) {
                System.out.println("picture - instagram");
            }
        }
    }

    interface SNS {}
    static class Facebook implements SNS {};
    static class Instagram implements SNS {};

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<SNS> sns = Arrays.asList(new Facebook(), new Instagram());

        posts.forEach(p->sns.forEach(s->p.postOn(s)));
    }
}
