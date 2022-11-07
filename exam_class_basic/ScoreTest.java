package exam_class_basic;

/*출력결과
=================
이름  국어 영어 수학
=================
홍길동 90  75  61
김철수 55  56  46
이진희 90  90  90

추가로 총점 평균 학점
 */

import java.util.Scanner;

public class ScoreTest {
    public static Scanner scan = new Scanner(System.in);
    //데이터를 입력받기 위한 메서드 Score score = s1
    public static void scanData(Score score) { // 매개변수 : 클래스명 참조변수 = 주솟값

        //필드에 직접 대입
        System.out.print("이름 입력 : ");
        score.name = scan.nextLine();

        System.out.print("국어점수 입력 : ");
        score.kor = scan.nextInt();

        System.out.print("영어점수 입력 : ");
        score.eng = scan.nextInt();

        System.out.print("과학점수 입력 : ");
        score.mat = scan.nextInt();
        scan.nextLine();
    }

    public static void main(String[] args) {
        Score s1 = new Score();
        //s1.scoreData("홍길동",90,75,61);
        scanData(s1);
        s1.getTotal();

        Score s2 = new Score();
        s2.scoreData("김철수", 55, 56, 46);
        s2.getTotal();

        Score s3 = new Score();
        s3.scoreData("이진희", 90, 90, 90);
        s3.getTotal();

        System.out.println("=================");
        String[] subject= {"이름", "국어", "영어", "수학", "총점", "평균", "학점"};
        for (int i = 0; i < subject.length;i++) {
            System.out.printf("%s\t", subject[i]);
        }
        System.out.println("\n=================");
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}
