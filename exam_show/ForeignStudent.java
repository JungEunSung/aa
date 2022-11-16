package exam_show;

public class ForeignStudent extends Student {
    private String national;

    public ForeignStudent() {
        super();
    }

    public ForeignStudent(String name, int age, int studentNumber, String national) {
        super(name, age, studentNumber);
        this.national = national;
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national;
    }

    public void show() {
        System.out.println("사람[이름 : " + super.getName() + ", 나이 : " + super.getAge() + ", 학번 : " + super.getStudentNumber() +
                ", 국적 : " + national + "]");
    }
}
