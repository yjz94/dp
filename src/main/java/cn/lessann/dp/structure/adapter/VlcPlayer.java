package cn.lessann.dp.structure.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file run...");
    }

    @Override
    public void playMp4(String fileName) {

    }
}
