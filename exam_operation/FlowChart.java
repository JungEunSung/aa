package exam_operation;

import java.util.Scanner;

public class FlowChart {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        int c;

        System.out.println("국어 점수 : ");
        a = input.nextInt();
        System.out.println("영어 점수 : ");
        b = input.nextInt();
        System.out.println("수학 점수 : ");
        c = input.nextInt();

        int sum;
        double average;
        sum = a + b + c;
        average = (double)sum / 3;

        System.out.println("총점은 " + sum + "입니다.");
        System.out.println("평균은" + average + "입니다.");
    }
}
