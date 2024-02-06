package DesignPattern.StructuralDesignPattern.AdapterPattern;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("mp3", "Flowers");
        player.play("vlc", "seven");
        player.play("mp4", "seven eleven");
        player.play("avi", "far far away");
    }
}
