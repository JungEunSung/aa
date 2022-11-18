package exam_interface;

public class TelevisionTest {
    public static void main(String[] arg) {

        Television tv = new Television();
        RemoteControl.changeBattery();
        tv.turnOn();
        tv.setVolume(20);
        System.out.println(tv.toString());
        tv.setMute(true);
        tv.turnOff();
        System.out.println();


        SmartTelevision smart = new SmartTelevision();
        RemoteControl.changeBattery();
        smart.turnOn();
        smart.search("www.naver.com(네이버)");
        smart.setVolume(20);
        System.out.println(smart.toString());
        smart.setMute(true);
        smart.turnOff();
        System.out.println();
    }
}
