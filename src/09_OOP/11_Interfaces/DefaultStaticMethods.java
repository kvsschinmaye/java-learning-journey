interface MediaPlayer {
    void play();

    default void stop(){
        System.out.println("Media playback stopped");
    }

    static void showInfo() {
        System.out.println("Media Player Interface");
    }
}

class MusicPlayer implements MediaPlayer {
    @Override
      public void play() {
        System.out.println("Playing Music");
    }
}

public class DefaultStaticMethods {
    public static void main(String[] args) {
        MusicPlayer mp = new MusicPlayer();
        mp.play();
        mp.stop();
        MediaPlayer.showInfo();
    }
}