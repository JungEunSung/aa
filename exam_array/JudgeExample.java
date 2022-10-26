package exam_array;

import java.util.Scanner;

public class JudgeExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] jumsu = new int[5];
        int sum = 0;
        double avg;

        for (int i = 0; i < jumsu.length; i++) {
            System.out.println("점수를 입력해주세요");
            jumsu[i] = scan.nextInt();
            while(true) {
                if (jumsu[i] > 0 || jumsu[i] < 100) {
                    System.out.println("점수는 0~100 사이로 입력해주세요");
                    System.out.println("점수를 입력해주세요");
                    jumsu[i] = scan.nextInt();
                } else {
                    break;
                }
            }
        }

        System.out.println("--- 입력된 점수들 ---");
        for (int number : jumsu) {
            System.out.println(number + "점");
        }

        System.out.println("--- 제거 대상 점수 ---");
        int temp = 0;
        int max = 0;
        int min = 0;
        for (int i = 0; i < jumsu.length-1; i++) {
            for (int j = i+1; j < jumsu.length; j++) {
                if(jumsu[i] < jumsu[j]) {
                    temp = jumsu[i];
                    jumsu[i] = jumsu[j];
                    jumsu[j] = temp;
                }
            }
        }
        max = jumsu[jumsu.length-1];
        min = jumsu[0];
        System.out.println("최고 점수 : " + max + "점");
        System.out.println("최소 점수 : " + min + "점");

        System.out.println("-----최종 입력 점수-----");
        for (int i = 0; i < jumsu.length; i++) {
            if (jumsu[i] != max && jumsu[i] != min) {
                System.out.println();
            }
        }


        int total = 0;
        System.out.println("--- 최종 입력 점수 ---");
        for (int i = 0; i < jumsu.length;i++) {
            total += jumsu[i];
        }

        avg = total/3;
        System.out.printf("평균 점수 : %.2f", avg);

        scan.close();
    }
}
