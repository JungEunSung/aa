package abstract_class;

class EmailSender extends MessageSender{
    private String senderAddr;
    private String emailBody;

    public String getSenderAddr() {
        return senderAddr;
    }

    public void setSenderAddr(String senderAddr) {
        this.senderAddr = senderAddr;
    }

    public String getEmailBody() {
        return emailBody;
    }

    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }

    public EmailSender(String title, String senderName, String senderAddr, String emailBody) {
        super(title, senderName);
        this.senderAddr = senderAddr;
        this.emailBody = emailBody;
    }

    @Override
    public void senMessage(String email) {
        System.out.println("제목 : " + super.getTitle());
        System.out.println("보내는 사람 : " + super.getSenderName() + " " + email);
        System.out.println("받는 사람 : " + this.senderAddr);
        System.out.println("내용 : " + this.emailBody);
    }
}
