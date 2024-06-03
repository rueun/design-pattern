package org.example.headfirst.chapter6.command.remotecontrol;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(final Light light) {
        this.light = light;
    }

    @Override
    public void exetute() {
        light.on();
    }
}
