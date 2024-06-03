package org.example.headfirst.chapter6.command.remotecontrol.deeping.command;

import org.example.headfirst.chapter6.command.remotecontrol.deeping.receiver.GarageDoor;

public class GarageDoorDownCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorDownCommand(final GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.down();
    }
}
