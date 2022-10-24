package exam_switch;

public class DoWhileExample3 {
    public static void main(String[] args) {

        int num = 0;
        do {
            System.out.println("num의 값은 : " + num);
            num++;
        } while (num < 10);

        System.out.println();

        int i = 1;
        do {
            System.out.println(i + " ");
            i++;
        } while (i <= 10);

        System.out.println();

        i = 10;
        do {
            System.out.println(i + " ");
            i--;
        } while (i > 0);

        System.out.println();
    }

}
