package exam_length;

public class RandomExample {
    public static void main(String[] args) {
        System.out.println(Math.random());

        System.out.println((int)(Math.random()*10));
        System.out.println((int)(Math.random()*10)+1);

        int num = (int)(Math.random()*6)+1;
        System.out.println("주사위 : " + num);
    }
}
