package org.example.headfirst.chapter6.command.remotecontrol;

import org.example.headfirst.chapter6.command.remotecontrol.command.Command;

public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(final Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }
}
