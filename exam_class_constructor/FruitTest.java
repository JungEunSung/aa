package exam_class_constructor;

public class FruitTest {
    public static void main(String[] args) {

        Fruit[] f = {
                new Fruit("banana", 4800),
                new Fruit("strawberry", 21000),
                new Fruit("persimmon", 19000),
                new Fruit("cherry", 12000)
        };

        int totalPrice = 0;
        for (int i = 0; i < f.length; i++) {
            totalPrice += f[i].getPrice();
        }
        int savePrice = (int) (totalPrice*0.15);

        System.out.println("===== 과일구입 목록 =====");

        for(Fruit ft : f) {
            System.out.println(ft.toString());
        }

        System.out.println("===================");
        System.out.println("총 금액 : " + totalPrice + "원");
        System.out.println("할인 후 결제 금액 : " + (totalPrice - savePrice) + "원");
    }
}
