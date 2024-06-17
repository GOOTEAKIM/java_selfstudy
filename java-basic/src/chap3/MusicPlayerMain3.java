package chap3;

public class MusicPlayerMain3 {
    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeDown(data);
        status(data);
        off(data);

    }

    public static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    public static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    public static void volumeUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("플레이어 볼륨: " + data.volume);
    }

    public static void volumeDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("플레이어 볼륨: " + data.volume);
    }

    public static void status(MusicPlayerData data) {
        if (data.isOn) {
            System.out.println("플레이어 ON, 볼륨: " + data.volume);
        } else {
            System.out.println("플레이어 OFF");
        }
    }
}
