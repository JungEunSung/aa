package simplephoneinfo;

public class PhoneInfo {
    private String name;
    private String phone;
    private String birth;

    public PhoneInfo() {
    }

    public PhoneInfo(String name,String phone) {
        this(name, phone, null);
    }

    public PhoneInfo(String name, String phone, String birth) {
        this.name = name;
        this.phone = phone;
        this.birth = birth;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getPhone() {return phone;}
    public void setPhone(String phone) {this.phone = phone;}

    public String getBirth() {return birth;}
    public void setBirth(String birth) {this.birth = birth;}

    public void showPhoneInfo() {
        System.out.println("name : " + name);
        System.out.println("phone : " + phone);

        if(birth != null) {
            System.out.println("birth : " + birth);
        }
            System.out.println(" ");
    }
}
