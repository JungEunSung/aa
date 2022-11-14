package exam_inheritance;

public class Employee extends  Person {
    private String dept;

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    //public String toString() {
    //return getName( + ":" + getAge() + ":" + getDept();

    public String toString() {
        return super.toString() + ":" + getDept();
    }
}
