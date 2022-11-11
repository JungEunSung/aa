package exam_class_constructor;

public class FruitTest {
    public static void main(String[] args) {

        Fruit f1 = new Fruit("banana", 4800);
        Fruit f2 = new Fruit("strawberry", 21000);
        Fruit f3 = new Fruit("persimmon", 19000);
        Fruit f4 = new Fruit("cherry", 12000);

        int totalPrice = f1.getPrice() + f2.getPrice() + f3.getPrice() + f4.getPrice();
        int savePrice = (int) (totalPrice * 0.15);

        System.out.println("========과일구입목록========");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
        System.out.println(f4.toString());

        System.out.println(("-------------------------"));
        System.out.println("총금액 : " + totalPrice + "원");
        System.out.println("할인 후 결제 금액 : " + (totalPrice - savePrice) + "원");
    }
}
