package exam_operation;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        int jumsu;
        Scanner input = new Scanner(System.in);
        System.out.println(" 점수를 입력해 주세요 ");
        jumsu = input.nextInt();
        if(jumsu >= 60) {
            System.out.println("합격");
        } else {
            System.out.println("불합격");
        }
        input.close();
    }
}
