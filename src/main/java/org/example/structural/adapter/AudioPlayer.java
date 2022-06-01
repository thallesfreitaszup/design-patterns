package org.example.structural.adapter;

public class AudioPlayer implements MediaPlayer {
    private MediaAdapter mediaAdapter;

    public AudioPlayer(MediaAdapter mediaAdapter) {
        this.mediaAdapter = mediaAdapter;
    }

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType) {
            case "MP3":
                System.out.printf("Playing mp3 file: %s%n", fileName);
            case "MP4":
                 mediaAdapter.playMP4(fileName);
            case "VLC":
                mediaAdapter.playVLC(fileName);
            default:
                throw new IllegalArgumentException("Type not supported");
        }
    }
}
