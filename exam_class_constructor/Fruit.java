package exam_class_constructor;

/* 과일 정보를 가진 Fruit 클래스를 만든다
필드로 과일명 (Fname), (price)를 가진다. 필드 초기화를 위한 접근자가 필요합니다.
총 구입액에서 15%할인 된 금액으로 구입한 과일주문내역을 출력해보자
 */

public class Fruit {
    private String fname;
    private int price;

    public Fruit(String fname, int price) {
        this.fname = fname;
        this.price = price;
    }

    public String getFname() {return fname;}

    public void setFname(String fname) {this.fname = fname;}

    public int getPrice() {return price;}

    public void setPrice(int price) {this.price = price;}

    public String toString() {return fname + ":" + price;}
}
