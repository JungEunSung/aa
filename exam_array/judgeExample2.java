package exam_array;

import java.util.Scanner;

public class judgeExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] jumsu = new int[5];
        int sum = 0;
        double avg;

        for (int i =0; i < jumsu.length; i++) {
            System.out.print("점수를 입력해주세요 : ");
            jumsu[i] = scan.nextInt();

            if (jumsu[i] < 0 || jumsu[i] > 100) {
                System.out.println("점수는 0~100사이로 입력해주세요");
                i--;
                continue;
            }

            if (i == jumsu.length - 1) { //마지막 인덱스(배열명.length -1)
                scan.close();
            }
        }
        System.out.println("총 입력된 점수들");
        for (int number : jumsu) {
            System.out.println(number + "점");
        }

        int max = jumsu[0];
        int min = jumsu[0];
        for (int i = 1; i < jumsu.length; i++) {
            if (jumsu[i] > max)
                max = jumsu[i];
            if (jumsu[i] < min)
                min = jumsu[i];
        }

        System.out.println("제거 대상 점수");
        System.out.printf("최고 점수 : %d점\n최소 점수 : %d점\n", max, min);

        System.out.println("최종점수 입력");
        for (int i = 0; i < jumsu.length; i++) {
            if (jumsu[i] != max && jumsu[i] != min) {
                System.out.println(jumsu[i] + "점");
                sum += jumsu[i];
            }
        }

        avg = (double) sum/3;
        System.out.printf("총점 : %d\n평균 : %.2f\n",sum ,avg);

        scan.close();
    }
}
