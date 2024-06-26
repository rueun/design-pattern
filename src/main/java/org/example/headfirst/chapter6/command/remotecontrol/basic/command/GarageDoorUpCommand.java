package org.example.headfirst.chapter6.command.remotecontrol.basic.command;

import org.example.headfirst.chapter6.command.remotecontrol.basic.receiver.GarageDoor;

public class GarageDoorUpCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorUpCommand(final GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
