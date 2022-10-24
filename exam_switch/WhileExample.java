package exam_switch;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {

        int i = 1;
        System.out.println("정수 : ");
        while (i <= 5) {
            System.out.println(i + " ");
            i++;
        }
        System.out.println();

        i = 5;
        System.out.println("정수 : ");
        while (true) {
            System.out.println(i + " ");
            i--;
            if(i < 0) {
                break;
            }
        }

        System.out.println();

        int num = 1, sum = 0;
        while (num <= 100) {

        }

        Scanner input = new Scanner(System.in);

        int jumsu = 0;
        System.out.println("점수는 0~100사이로 입력해주셈");
        jumsu = input.nextInt();

        while (jumsu<0 || jumsu<100) {
            System.out.println("점수는 0~100사이로 입렵해주셈");
            jumsu = input.nextInt();
        }
    }
}
