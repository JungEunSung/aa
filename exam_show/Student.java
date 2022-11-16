package exam_show;

public class Student extends Person {
    private int studentNumber;

    public Student() {
        super();
    }

    public Student(String name, int age, int studentNumber) {
        super(name, age);
        this.studentNumber = studentNumber;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber ;
    }

    public void show() {
        System.out.println("사람[이름 : " + super.getName() + ", 나이 : " + super.getAge() +
            ", 학번 : " + studentNumber + "]");
    }
}
