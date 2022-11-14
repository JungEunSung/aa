package exam_smart;

public class SmartPhone {
    private String maker, name;
    private int price, discountRate;

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void int setPrice(int price) {
        this.maker = maker;
    }

    public int getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(int discountRate) {
        this.discountRate = discountRate;
    }

    public SmartPhone() {
        this.maker = "";
        this.name = "";
        this.price = 0;
        this.discountRate = 0;

        public SmartPhone(String maker, String name, int price) {
            this.maker = maker;
            this.name = name;
            this.price = price;
        }

        public SmartPhone(String maker, String name, int price, int discountRate) {
            this.maker = maker;
            this.name = name;
            this.price = price;
            this.discountRate = discountRate;
        }

        public int calculateDiscount() {
            return this.price * discountRate / 100;
        }
    }




}
