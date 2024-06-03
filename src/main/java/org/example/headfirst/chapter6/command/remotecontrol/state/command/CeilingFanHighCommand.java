package org.example.headfirst.chapter6.command.remotecontrol.state.command;

import org.example.headfirst.chapter6.command.remotecontrol.state.receiver.CeilingFan;

public class CeilingFanHighCommand extends CeilingFanCommand {

    public CeilingFanHighCommand(final CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }
}
