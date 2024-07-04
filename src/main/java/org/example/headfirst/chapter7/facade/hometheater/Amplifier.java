package org.example.headfirst.chapter7.facade.hometheater;

public class Amplifier {
    public void on() {
        System.out.println("Top-O-Line Amplifier on");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Top-O-Line Amplifier setting DVD player to Top-O-Line DVD Player");
    }

    public void setSurroundSound() {
        System.out.println("Top-O-Line Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int volume) {
        System.out.println("Top-O-Line Amplifier setting volume to " + volume);
    }

    public void off() {
        System.out.println("Top-O-Line Amplifier off");
    }

    public void setStreamingPlayer(final StreamingPlayer player) {
        System.out.println("Top-O-Line Amplifier setting Streaming Player to Top-O-Line Streaming Player");
    }
}
