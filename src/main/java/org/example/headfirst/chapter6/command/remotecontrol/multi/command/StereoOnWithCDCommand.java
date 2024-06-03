package org.example.headfirst.chapter6.command.remotecontrol.multi.command;

import org.example.headfirst.chapter6.command.remotecontrol.multi.receiver.Stereo;

public class StereoOnWithCDCommand implements Command {

    private final Stereo stereo;

    public StereoOnWithCDCommand(final Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
}
