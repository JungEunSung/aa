package exam_if2;

import java.util.Scanner;

public class jumsu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int mid = 0;
        int last= 0;
        int re = 0;
        int att = 0;
        double result = 0;


        System.out.println("중간고사 점수를 입력");
        mid = scan.nextInt();

        System.out.println("기말고사 점수를 입력");
        last = scan.nextInt();

        System.out.println("레포트 점수를 입력");
        re = scan.nextInt();

        System.out.println("출석 점수를 입력");
        att = scan.nextInt();

        result = ((mid+last)/2)*0.6 + (re*0.2) + (att*0.2);

        System.out.println("-------결과입니다--------");
        System.out.println("중간고사 : " + mid + "\n기말고사 : " + last + "\n레포트 : " + re + "\n출석점수 : " + att);
        System.out.printf("\n성적 : %.2f\n" , result);

        if (result >= 90) {
            System.out.println("학점 : A");
        } else if (result >= 80) {
            System.out.println("학점 : B");
        } else if (result >= 70) {
            System.out.println("학점 : C");
        } else if (result >= 60) {
            System.out.println("학점 : D");
        } else {
            System.out.println("학점 : f");
        }

        if (result >= 80) {
            System.out.println("평가 : excellent");
        } else if (result >= 60) {
            System.out.println("평가 : good");
        } else {
            System.out.println("평가 : poor");
        }

        scan.close();
    }
}
