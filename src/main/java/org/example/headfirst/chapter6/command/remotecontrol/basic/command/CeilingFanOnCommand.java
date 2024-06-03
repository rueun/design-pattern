package org.example.headfirst.chapter6.command.remotecontrol.basic.command;

import org.example.headfirst.chapter6.command.remotecontrol.basic.receiver.CeilingFan;

public class CeilingFanOnCommand implements Command {
    private final CeilingFan ceilingFan;

    public CeilingFanOnCommand(final CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.high();
    }

    @Override
    public void undo() {
        ceilingFan.off();
    }
}
