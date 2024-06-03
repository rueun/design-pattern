package org.example.headfirst.chapter6.command.remotecontrol.undo.receiver;

public class Stereo {
    private final String location;

    public Stereo(final String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is on");
    }

    public void off() {
        System.out.println(location + " stereo is off");
    }

    public void setCD() {
        System.out.println(location + " stereo is set for CD input");
    }

    public void setDVD() {
        System.out.println(location + " stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println(location + " stereo is set for Radio");
    }

    public void setVolume(final int volume) {
        System.out.println(location + " stereo volume set to " + volume);
    }
}
