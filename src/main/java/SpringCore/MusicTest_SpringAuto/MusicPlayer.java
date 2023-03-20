package SpringCore.MusicTest_SpringAuto;

public class MusicPlayer {
    Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }
    public void PlayMusic(){
        System.out.println("Play "+ music.getSong());
    }
}
