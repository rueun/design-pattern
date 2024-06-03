package org.example.headfirst.chapter6.command.remotecontrol.state.command;

import org.example.headfirst.chapter6.command.remotecontrol.state.receiver.CeilingFan;

public class CeilingFanLowCommand extends CeilingFanCommand {

    public CeilingFanLowCommand(final CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.low();
    }
}
