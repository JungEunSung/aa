package abstract_class;

public class MessageSenderTest {
    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        EmailSender e = new EmailSender("생일을 축하합니다" , "고객센터", "javaone@naver.com",
                "10%할인쿠폰이 발행되었습니다");
        e.senMessage("admin@dukkeshop.co.kr");

        System.out.println("-------------------------------------------");
        SMSSender s = new SMSSender("생일을 축하합니다", "고객센터", "02-000-0000",
                "10%할인쿠폰이 발행되었습니다");
        s.sendMessage("010-000-0000");
    }
}
