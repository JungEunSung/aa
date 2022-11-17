package Birthday;

public class SMSSender extends MessageSender {

    @Override
    public void sendName() {
        System.out.println("보내는 사람 : 고객센터");
    }

    @Override
    public void returnPhoneNo() {
        System.out.println("회신 전화번호 : 02-000-0000");
    }

    @Override
    public void message() {
        System.out.println("메시지 내용 : 10%할인쿠폰이 발행되었습니다.");
    }
}
