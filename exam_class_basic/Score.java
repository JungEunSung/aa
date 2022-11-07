package exam_class_basic;

/*성적을 출력하는 Score 클래스를 정희하자
이름 / 국어 / 영어 / 수학 / 총점을 저장하고자 한다.
필드에 값을 설정할 수 있는 기능, 국어 영어 수학의 합을 구하는 기능, 모든 필드를 출력할
수 있는 기능을 포함하도록 한다.(메서드 구현)
 */

public class Score {
    //필드 선언
    public String name;
    public int kor;
    public int eng;
    public int mat;
    public int tot;
    //접근제한자 리턴타입 메서드명 ->메서드 선언
    //  void
    //  자료형 (기초형/잠조형)

    //필드에 값을 대입하기 위한 메서드
    public void scoreData(String n, int k, int e, int m) {
        name = n;
        kor = k;
        eng = e;
        mat = m;
    }

    //합을 구하는 메서드
    public void getTotal() {
        tot = kor + eng + mat;
    }

    //평균을 구하는 메서드
    public double getAverage() {
        return (double)tot/3;
    }

    //학점을 구하는 메서드
    public char getGrade() {
        char hakjum = '\0';  //null을 의미
        double avg = getAverage();

        if(avg >= 90) {
            hakjum = 'A';
        } else if (avg >= 80) {
            hakjum = 'B';
        } else if (avg >= 70) {
            hakjum = 'C';
        } else if (avg >= 60) {
            hakjum = 'D';
        } else {
            hakjum = 'F';
        }
        return hakjum;
    }

    public String toString() {
        //return name + " " + kor + " " + eng + " " + mat + " " +tot;
        return String.format("%s\t%d\t%d\t%d\t%d\t%.1f\t%c", name , kor , eng , mat , tot , getAverage(), getGrade());
    }
}
