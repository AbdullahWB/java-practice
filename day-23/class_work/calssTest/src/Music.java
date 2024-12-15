class MusicPlayer {
    private boolean isPlaying = false;

    public void play() {
        if (!isPlaying) {
            isPlaying = true;
            System.out.println("Music is playing.");
        } else {
            System.out.println("Music is already playing.");
        }
    }

    public void pause() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Music is paused.");
        } else {
            System.out.println("Music is not playing.");
        }
    }

    public void stop() {
        if (isPlaying) {
            isPlaying = false;
            System.out.println("Music has stopped.");
        } else {
            System.out.println("Music is not playing.");
        }
    }
}

public class Music {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();
        player.play();
        player.pause();
        player.stop();
    }
}
