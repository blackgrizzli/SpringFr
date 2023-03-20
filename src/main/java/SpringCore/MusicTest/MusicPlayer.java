package SpringCore.MusicTest;

public class MusicPlayer {
    Music music;
// IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void playMusic(){
        System.out.println("Play " + music.getSong());
    }
}
