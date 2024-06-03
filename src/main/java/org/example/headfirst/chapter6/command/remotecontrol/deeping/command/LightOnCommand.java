package org.example.headfirst.chapter6.command.remotecontrol.deeping.command;

import org.example.headfirst.chapter6.command.remotecontrol.deeping.receiver.Light;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void undo() {
        light.off();
    }
}
