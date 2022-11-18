package exam_interface;

public class Television implements RemoteControl {
    private int volume;
    private int channel;

    @Override
    public void turnOn() {
        System.out.println("TV켜기");
    }

    @Override
    public void turnOff() {
        System.out.println("TV끄기");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }
    }

    public void printChannel() {
        System.out.println("현재 채널 선택은 " + channel + "번입니다");
    }

    public String toString() {
        return "현재 TV 볼륨 : " + volume;
    }
}
