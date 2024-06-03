package org.example.headfirst.chapter6.command.remotecontrol.state.command;

import org.example.headfirst.chapter6.command.remotecontrol.state.receiver.CeilingFan;

public class CeilingFanOffCommand extends CeilingFanCommand {

    public CeilingFanOffCommand(final CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

}
