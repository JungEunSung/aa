package Birthday;

public abstract class MessageSender {
    public abstract void sendName();
    public abstract void sendAddr();
    public abstract void emailBody();
    public abstract void returnPhoneNo();
    public abstract void message();

    public void title(); {
        System.out.println("제목 : 생일을 축하합니다.");
    }

    public final void run() {
        title();
        sendName();
        sendAddr();
        emailBody();
        returnPhoneNo();
        message();
    }
}
