package exam_switch;

import java.util.Scanner;

public class ForExample {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + ". ");
            System.out.println("Hello World!");
            System.out.println("I Love Coding");
        }

        System.out.println();

        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        System.out.printf("1부터 10까지의 정수의 합 = %d\n", sum);
        System.out.println();

        int start, end;
        Scanner input = new Scanner(System.in);
        System.out.print("두 개의 수를 입력해주세요 : ");
        start = input.nextInt();
        end = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " ");
        }

        input.close();
        System.out.println();

        sum = 0;
        for(int i = 1; i <= 10; i++) {
            if(i % 3 == 0) {
                sum += i;
            }
        }
        System.out.println("3의 배수의 합 : " + sum);
        System.out.println();
    }
}
