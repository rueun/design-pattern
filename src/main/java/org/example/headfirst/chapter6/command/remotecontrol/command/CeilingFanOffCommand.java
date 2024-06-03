package org.example.headfirst.chapter6.command.remotecontrol.command;

import org.example.headfirst.chapter6.command.remotecontrol.receiver.CeilingFan;

public class CeilingFanOffCommand implements Command {
    private final CeilingFan ceilingFan;

    public CeilingFanOffCommand(final CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.off();
    }
}
