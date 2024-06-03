package org.example.headfirst.chapter6.command.remotecontrol.deeping.receiver;

public class Light {

    private String location;

    public Light(final String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " Light is on");
    }

    public void off() {
        System.out.println(location + " Light is off");
    }
}
