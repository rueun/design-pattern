package org.example.headfirst.chapter6.command.remotecontrol.basic.receiver;

public class GarageDoor {
    private String location;

    public GarageDoor(final String location) {
        this.location = location;
    }

    public void up() {
        System.out.println("Garage Door is Open");
    }

    public void down() {
        System.out.println("Garage Door is Closed");
    }

    public void stop() {
        System.out.println("Garage Door is Stopped");
    }

    public void lightOn() {
        System.out.println("Garage light is on");
    }

    public void lightOff() {
        System.out.println("Garage light is off");
    }
}


