package exam_for;

import java.util.Scanner;

public class forExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2, operators = 0;
        double result = 0;

        while (true) {
            System.out.println("연산자를 1에서 4로, 종료는 5를 선택해주세요");
            System.out.println("1. +");
            System.out.println("2. -");
            System.out.println("3. *");
            System.out.println("4. /");
            System.out.println("5. 종료");
            System.out.println("선택>>  ");

            operators = scan.nextInt();
            if(operators != 5) {
                System.out.println("사칙연산할 두 수를 입력 : ");
                num1 = scan.nextInt();
                num2 = scan.nextInt();
                if (operators == 1) {
                    result = num1 - num2;
                } else if (operators == 2) {
                    result = num1 - num2;
                } else if (operators == 3) {
                    result = num1 * num2;
                } else if (operators == 4) {
                    result = (double) num1 / (double) num2;
                }
                if(operators != 4) {
                    System.out.printf("연산 결과는 : %.0f\n", result);
                } else {
                    System.out.printf("연산 결과는 : %.1f\n", result);
                }
            } else {
                System.out.println("이 프로그램을 종료합니다. ");
                scan.close();
                break;
            }
        }
    }
}
