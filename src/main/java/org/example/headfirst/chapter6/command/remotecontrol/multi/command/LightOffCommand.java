package org.example.headfirst.chapter6.command.remotecontrol.multi.command;

import org.example.headfirst.chapter6.command.remotecontrol.multi.receiver.Light;

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
