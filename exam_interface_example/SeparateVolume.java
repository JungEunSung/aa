package exam_interface_example;

public class SeparateVolume implements Lendable {
    private String requestNo;
    private String bookTitle;
    private String writer;
    private String borrower;
    private String checkOutDate;
    private int state;

    public SeparateVolume(String requestNo, String bookTitle, String writer) {
        if(state != 0)
            return;
        this.borrower = borrower;
        this.checkOutDate = date;
        this.state = 1;
        System.out.println("*" bookTitle + "(" + writer + " )이가 대출되었습니다.");
        System.out.println("대출일:" + this.borrower);
        System.out.println("대출일:" + this.checkOutDate + "\n");
    }

    @Override
    public void checkIn()
}
