package exam_switch;

public class SwitchCharExample {
    public static void  main(String[] args) {
        char grade = 'B';

        switch (grade) {
            case 'A' :
            case 'a' :
                System.out.println("우수 회원입니다.");
                break;
            case 'B' :
            case 'b' :
                System.out.println("일반회원입니다.");
                break;
            default:
                System.out.println("일반손님입니다.");
        }

        grade = 'A';
        switch (grade) {
            case 'A', 'a' -> {
                System.out.println("우수 회원입니다.");
            }
            case 'B', 'b' -> {
                System.out.println("일반회원입니다.");
            }
            default -> {
                System.out.println("일반손님입니다.");
            }
        }
        switch (grade) {
            case'A', 'a' -> System.out.println("우수 회원입니다.");
            case'B', 'b' -> System.out.println("일반회웝입니다.");
            default -> System.out.println("일반손님입니다.");
        }
    }
}
