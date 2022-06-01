package org.example.structural.adapter;

public class MediaAdapter implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.printf("Playing VLC file: %s", fileName);
    }

    @Override
    public void playMP4(String fileName) {
        System.out.printf("Playing mp4 file: %s", fileName);
    }
}
