import java.text.SimpleDateFormat;
import java.util.Date;

public class Inter {
    public static void main(String[] args) {

        Date date = new Date();

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy년 MM월 dd일 HH시 mm분 ss초");

        System.out.println(simpleDateFormat.format(date));
    }
}
