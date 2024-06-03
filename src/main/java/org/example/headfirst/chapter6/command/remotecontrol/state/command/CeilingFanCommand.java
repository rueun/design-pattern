package org.example.headfirst.chapter6.command.remotecontrol.state.command;

import org.example.headfirst.chapter6.command.remotecontrol.state.receiver.CeilingFan;

public abstract class CeilingFanCommand implements Command {
    protected final CeilingFan ceilingFan;
    protected int prevSpeed;

    protected CeilingFanCommand(final CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
