package exam_array_grades;

public class GradesProgramming {
    public static void main(String[] args) {
        String[] name= {"홍길동", "김철수", "이진희"};
        int[][] score = {
                {90, 75, 61, 0},
                {55, 56, 46, 0},
                {90, 90, 90, 0}
        };

        double[] avg = new double[3];
        char[] grade = new char[3];
        String[] pass = new String[3];
        int[] rank = {1, 1, 1};

        for (int i = 0; i < name.length; i++) {
            for (int j = 0; j < name.length; j++) {
                score[i][3] += score[i][j];
            }

            avg[i] = (double) score[i][3]/3;

            if(avg[i] >= 90) {
                grade[i] = 'A';
            } else if (avg[i] >= 80) {
                grade[i] = 'B';
            } else if (avg[i] >= 70) {
                grade[i] = 'C';
            } else if (avg[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }

            if (avg[i] >= 60) {  //재수강여부
                pass[i] = "pass";
            } else {
                pass[i] = "nopass";
            }
        }

        //순위구하기
        for (int i = 0; i < name.length; i++) {
            for(int j = 0; j < name.length; j++) {
                if(avg[i] < avg[j]) {
                    ++rank[i];
                }
            }
        }
        System.out.printf("%28s\n", "성적 프로그램 :");

        System.out.println("========================================");
        System.out.println("번호 이름 국어 수학 총점 평균 학점 재수강  순위");
        System.out.println("========================================");

        for(int i = 0; i < name.length; i++) {
            System.out.printf("%2d %-4s", i + 1 , name[i]);
            for (int j = 0; j < score[i].length; j++) {
                System.out.printf("%3d ",score[i][j]);
            }
            System.out.printf(" %5.2f %3c %-7s %-3d\n", avg[i], grade[i], pass[i], rank[i]);
        }
    }
}
