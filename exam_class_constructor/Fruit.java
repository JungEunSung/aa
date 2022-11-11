package exam_class_constructor;

public class Fruit {
    private String fname;
    private int price;

    public Fruit() {}

    public Fruit(String fname, int price) {
        this.fname = fname;
        this.price = price;
    }

    public String getFname() {return fname;}

    public void setFname (String fname) {this.fname = fname; }

    public int getPrice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public String toString() {
        return fname + " : " + price;
    }
}
