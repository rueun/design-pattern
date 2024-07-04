package org.example.headfirst.chapter7.facade.hometheater;

public class DvdPlayer implements Player {
    @Override
    public void on() {
        System.out.println("Top-O-Line DVD Player on");
    }

    @Override
    public void off() {
        System.out.println("Top-O-Line DVD Player off");
    }

    @Override
    public void play(String movie) {
        System.out.println("Top-O-Line DVD Player playing \"" + movie + "\"");
    }

    @Override
    public void stop() {
        System.out.println("Top-O-Line DVD Player stopped");
    }

    @Override
    public void eject() {
        System.out.println("Top-O-Line DVD Player eject");
    }

    @Override
    public void pause() {
        System.out.println("Top-O-Line DVD Player paused");
    }

    @Override
    public void setSurroundAudio() {

    }

    @Override
    public void setTwoChannelAudio() {

    }

    @Override
    public void setVolume(int volume) {

    }
}
