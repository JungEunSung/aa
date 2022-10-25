package exam_array;

import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};

        System.out.println("number[0]" + numbers[0]);
        System.out.println("number[1]" + numbers[1]);
        System.out.println("number[2]" + numbers[2]);
        System.out.println();

        double[] arrayDouble = new double[2];
        for (int i = 0; i < 2; i++) {
            System.out.println("arrayDouble [" + i + "] = " + arrayDouble[i]);
        }
        System.out.println();

        int[] nums = new int[5];
        Scanner scan = new Scanner(System.in);

        System.out.println("=== 배열의 값 입력 ===");
        for (int i = 0; i < 5; i++) {
            System.out.print((i + 1) + "번째 정수 입력 : ");
            nums[i] = scan.nextInt();
        }

        System.out.println("=== 배열의 값 입력 ===");
        for (int j = 0; j < 5; j++) {
            System.out.println("nums [" + j + "] = " + nums[j]);
        }

        System.out.println("=== 배열의 값 출력 ===");
        for (int value : nums) {
            System.out.print(value + " ");
        }
        System.out.println();

        //5명의 국어점수는 배열에 초기화 하고 영어점수는 입력을 받아 배열에 저장하여 출력

        int[] kor = new int[]{90, 95, 90, 85, 100}; //배열 초기화 (국어점수)
        int[] eng = new int[5];

        for (int i = 0; i < eng.length; i++) { //입력값 배열저장 (영어점수)
            System.out.print("영어 점수를 입력해 주세요.");
            eng[i] = scan.nextInt();
        }

        for (int i = 0; i < kor.length; i++) { //배열값 출력 (국어점수와 영어점수의 배열의 크기가 동일함
            System.out.printf("국어 : %3d ", kor[i]);
            System.out.printf("영어 : %3d\n", eng[i]);
        }
        scan.close();
    }

}
