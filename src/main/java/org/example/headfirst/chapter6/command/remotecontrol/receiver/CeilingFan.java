package org.example.headfirst.chapter6.command.remotecontrol.receiver;

public class CeilingFan {
    private final String location;

    public CeilingFan(final String location) {
        this.location = location;
    }

    public void high() {
        System.out.println(location + " ceiling fan is on high");
    }

    public void off() {
        System.out.println(location + " ceiling fan is off");
    }
}
