package exam_if;

import java.util.Scanner;

public class hakjumExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumsu = 0;
        char hakjum = '\0';
        System.out.println("점수를 입력해주세요");
        jumsu = input.nextInt();

        if (jumsu < 0 || jumsu > 100) {
            System.out.println("점수를 0~100 사이로 입력해주세요");
        } else {
            if (jumsu >= 90) {
                hakjum = 'A';
            } else if (jumsu >= 80) {
                hakjum = 'B';
            } else if (jumsu >= 70) {
                hakjum = 'C';
            } else if (jumsu >= 60) {
                hakjum = 'D';
            } else {
                hakjum = 'f';
            }

        }
        System.out.printf("점수 + %d 학점 = %C" , jumsu , hakjum);
    }
}
