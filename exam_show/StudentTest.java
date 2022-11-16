package exam_show;

public class StudentTest {

    public static void main(String[] args) {
        Person p = new Person("홍길동", 56);
        Student s = new Student("하늘봄", 41, 9901001);
        ForeignStudent fs = new ForeignStudent("Olivia", 39, 97060004, "U.S.A");

        p.show();
        s.show();
        fs.show();

    }
}
