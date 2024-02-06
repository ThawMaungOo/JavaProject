package DesignPattern.StructuralDesignPattern.AdapterPattern;

public class AudioPlayer implements MediaPlayer{
    MediaAdapter mediaAdapter;

    @Override
    public void play(String audiType, String fileName) {
        if (audiType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file named " + fileName);
        } else if (audiType.equalsIgnoreCase("vlc")) {
            mediaAdapter = new MediaAdapter(audiType);
            mediaAdapter.play(audiType, fileName);
        }
        else if (audiType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audiType);
            mediaAdapter.play(audiType, fileName);
        }
        else {
            System.out.println(fileName + " is unsupported format");
        }
    }
}
