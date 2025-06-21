
interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

class MediaPlayer {
    void play() { System.out.println("Playing media."); }
    void pause() { System.out.println("Media paused."); }
    void stop() { System.out.println("Media stopped."); }
}

class VideoPlayer extends MediaPlayer implements Playlist {
    public void addSong(String song) {
        System.out.println(song + " added to playlist.");
    }
    public void removeSong(String song) {
        System.out.println(song + " removed from playlist.");
    }
    void rewind() { System.out.println("Video rewinded."); }
    void fastForward() { System.out.println("Video fast-forwarded."); }
}

public class MediaPlayerDemo {
    public static void main(String[] args) {
        VideoPlayer vp = new VideoPlayer();
        vp.play();
        vp.addSong("Song 1");
        vp.rewind();
        vp.pause();
        vp.removeSong("Song 1");
        vp.stop();
    }
}
