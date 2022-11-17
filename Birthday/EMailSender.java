package Birthday;

public class EMailSender extends MessageSender {

    @Override
    public void sendName() {
        System.out.println("보내는 사람 : 고객센터 admin@dukeeshop.co.kr");
    }

    @Override
    public void sendAddr() {
        System.out.println("받는 사람 : javaone@naver.com");
    }

    @Override
    public void emailBody() {
        System.out.println("내용 : 10% 할인쿠폰이 발행되었습니다.");
    }
}
