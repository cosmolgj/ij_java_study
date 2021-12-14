package blog_lecture;

import java.util.Arrays;
import java.util.List;

public class DoubleDisp2 {
    interface Post { void postOn(SNS sns); }

    static class Text implements Post {
        @Override
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }

    static class Picture implements Post {
        @Override
        public void postOn(SNS sns) {
            sns.post(this);
        }
    }

    interface SNS {
        void post(Text post);
        void post(Picture post);
    }

    static class Facebook implements SNS {
        @Override
        public void post(Text post) { System.out.println("text - Facebook"); }
        @Override
        public void post(Picture post) { System.out.println("picture - Facebook"); }
    };

    static class Instagram implements SNS {
        @Override
        public void post(Text post) { System.out.println("text - Instagram"); }
        public void post(Picture post) { System.out.println("picture - Instagram"); }
    };

    static class KakaoStory implements SNS {
        @Override
        public void post(Text post) { System.out.println("text - KakaoStory"); }
        @Override
        public void post(Picture post) { System.out.println("picture - KakaoStory"); }
    }

    public static void main(String[] args) {
        List<Post> posts = Arrays.asList(new Text(), new Picture());
        List<SNS> sns = Arrays.asList(new Facebook(), new Instagram(), new KakaoStory());

        posts.forEach(p->sns.forEach(s->p.postOn(s)));
    }
}
