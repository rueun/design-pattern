package org.example.headfirst.chapter6.command.remotecontrol.undo.command;

import org.example.headfirst.chapter6.command.remotecontrol.undo.receiver.Light;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
}
