package chap3;

public class MusicPlayer {
    int volume;
    boolean isOn;

    void on() {
        isOn = true;
        System.out.println("플레이어 ON");
    }

    void off() {
        isOn = false;
        System.out.println("플레이어 OFF");
    }

    void volumeUp() {
        volume++;
        System.out.println("현재 볼륨 : " + volume);
    }

    void volumeDown() {
        volume--;
        System.out.println("현재 볼륨:" + volume);
    }

    void showStatus() {
        if (isOn) {
            System.out.println("플레이어 ON, 현재 볼륨: " + volume);
        } else {
            System.out.println("플레이어 OFF");
        }
    }
}
