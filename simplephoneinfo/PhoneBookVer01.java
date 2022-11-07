package simplephoneinfo;

public class PhoneBookVer01 {
    public static void main(String[] args) {
        PhoneInfo pb1 = new PhoneInfo("임미경", "010-2345-6573", "1965.03.28");
        PhoneInfo pb2 = new PhoneInfo("김현수", "010-6435-1249");

        pb1.showPhoneInfo();
        pb2.showPhoneInfo();
    }
}
