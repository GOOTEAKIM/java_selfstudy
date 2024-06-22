package chap6;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근 (Speaker 클래스에서 private 추가하면 volume 필드 수정 불가)

//        System.out.println("volume 필드 직접 접근 수정");
//
//        speaker.volume = 200;
//        speaker.showVolume();
    }
}
