package exam_if;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ifExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int su = 0;
        String data = "";

        System.out.print("짝수와 홀수를 구할 수를 입력해라");
        su = input.nextInt();

        System.out.println("su의 초기값 : "+ su);

        if(su%2 == 0) {
            data = "짝수";
        } else {
            data = "홀수";
        }
        System.out.println("입력한 " + su + "는 " + data + "이다");
    }
}
