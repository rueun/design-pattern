package org.example.headfirst.chapter6.command.remotecontrol;

public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(final GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void exetute() {
        garageDoor.up();
    }
}
