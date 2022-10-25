package exam_length;

public class taxes {
    public static void main(String[] args) {

        int num = 1, sum = 0;
        while (num <= 100) {
            sum = sum + num;
            num = num + 1;
        }
        System.out.println("1~100사이의 합을 구해드립니다.");
        System.out.println(sum);
    }
}
