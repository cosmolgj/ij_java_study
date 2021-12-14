package blog_lecture;

public class ExceptionTest {
    public static void main(String[] args) {
        String[] name = new String[2];

        try {
            name[0] = "IU";
            System.out.println("name : " + name[0]);

            name[1] = "Twice";
            System.out.println("name : " + name[1]);

            name[2] = "Heys";
            System.out.println("name : " + name[2]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 참조 에러 발생");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("시스템 종료");
        }
    }
}
