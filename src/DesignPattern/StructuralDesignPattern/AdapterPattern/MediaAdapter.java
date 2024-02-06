package DesignPattern.StructuralDesignPattern.AdapterPattern;

public class MediaAdapter implements MediaPlayer{
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){
        if (audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer = new VlcPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audiType, String fileName) {
        if (audiType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVLC(fileName);
        } else if (audiType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
