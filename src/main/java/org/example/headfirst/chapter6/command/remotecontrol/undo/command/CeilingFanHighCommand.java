package org.example.headfirst.chapter6.command.remotecontrol.undo.command;

import org.example.headfirst.chapter6.command.remotecontrol.undo.receiver.CeilingFan;

public class CeilingFanHighCommand implements Command {

    private CeilingFan ceilingFan;

    public CeilingFanHighCommand(final CeilingFan ceilingFan) {
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
