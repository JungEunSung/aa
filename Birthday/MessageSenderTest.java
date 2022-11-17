package Birthday;

public class MessageSenderTest {
    public static void main(String[] args) {
        System.out.println("--------------------");
        MessageSender myMessage = new EMailSender();
        myMessage.run();

        System.out.println("--------------------");
        MessageSender yourMessage = new SMSSender();
        yourMessage.run();
    }
}
