package exam_mutator_accessor;

public class BookShopTest {
    public static void main(String[] args) {
        BookShop bs = new BookShop();

        System.out.println("<<값대입>>");
        bs.bookShopData("web/servlet", "Dominica", 3000);

        System.out.println("책이름 : " + bs.getTitlee());
        System.out.println("저자 : " + bs.getAuthor());
        System.out.println("책가격 : " + bs.getPrice());

        System.out.println("\n<<값 변경 후 출력>>");
        bs.setTitle("안드로이드는 이렇게 시작하세요");
        bs.setAuthor("홍길동");
        bs.setPrice(3000);

        System.out.println(bs.toString());
    }
}
