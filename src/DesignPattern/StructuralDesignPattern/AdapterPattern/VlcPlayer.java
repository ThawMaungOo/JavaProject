package DesignPattern.StructuralDesignPattern.AdapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer{

    @Override
    public void playVLC(String fileName) {
        System.out.println("Playing vlc player with filename " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
