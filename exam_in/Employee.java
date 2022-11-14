package exam_in;

public class Employee {
    public static void main(String[] args) {
        Person emp = new Person();
        emp.setEmpData("김철수", "서울시 영동구", "010-1234-5678", 150);
        System.out.println(emp.toString());


        Manager mgr = new Manager();
        mgr.setMgrDate("홍길동", "서울시 역삼역", "010-7894-5612", 199 , "대리", 100);
        System.out.println(mgr.toString());
    }


}
