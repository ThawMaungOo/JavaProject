package DesignPattern.StructuralDesignPattern.AdapterPattern;

public class Mp4Player implements AdvancedMediaPlayer{

    @Override
    public void playVLC(String fileName) {
        // do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 player with filename " + fileName);
    }
}
