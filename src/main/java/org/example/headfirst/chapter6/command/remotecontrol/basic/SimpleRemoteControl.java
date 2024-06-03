package org.example.headfirst.chapter6.command.remotecontrol.basic;

import org.example.headfirst.chapter6.command.remotecontrol.basic.command.Command;

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
