package org.example.headfirst.chapter6.command.remotecontrol;

public class SimpleRemoteControl {
    private Command slot;

    public SimpleRemoteControl() {
    }

    public void setCommand(final Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.exetute();
    }
}
