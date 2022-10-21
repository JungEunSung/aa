package eaxm_input;

import java.util.Scanner;

public class InputString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String x;
        int y ;
        String z;

        System.out.print("이름 : ");
        x = input.nextLine();

        System.out.print("나이 : ");
        y = input.nextInt();
        input.nextLine();

        System.out.print("주소 : ");
        z = input.nextLine();

        System.out.println(x + "님 안녕하세요 !" + (y) + "살이네요");
        System.out.println("주소는 없으시네요!");

        input.close();
    }
}
