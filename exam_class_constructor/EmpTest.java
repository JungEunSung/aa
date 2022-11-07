package exam_class_constructor;

public class EmpTest {
    public static void main(String[] args) {
        Emp[] ep = {
                new Emp("A111", 117000),
                new Emp("B222", 450000),
                new Emp("C333", 570000)
        };

        System.out.printf("%30s\n","봉급계산서");
        System.out.println("==============================");
        System.out.printf("%3s%7s%9s%10s%10s%10s\n","사번","기본급", "수당", "세금", "본봉", "등급");
        System.out.println("==============================");

        for(Emp e : ep ) {
            System.out.println(e.toString());
        }
    }
}
