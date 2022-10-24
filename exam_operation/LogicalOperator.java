package exam_operation;

public class LogicalOperator {
    public static void main(String[] args) {
        int x = 3;
        int y = 4;

        System.out.println((x == 3) && (y == 7));
        System.out.println((x == 3) || (y == 7));

        Boolean result = (++x == 3) && (y++ == 7);

        System.out.println("x == " + x + ", y = " +y);
        System.out.println("result = " + result);

        result = (x++ == 4) || (++y == 8);
    }
}
