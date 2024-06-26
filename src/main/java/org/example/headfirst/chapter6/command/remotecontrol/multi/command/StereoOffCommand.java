package org.example.headfirst.chapter6.command.remotecontrol.multi.command;

import org.example.headfirst.chapter6.command.remotecontrol.multi.receiver.Stereo;

public class StereoOffCommand implements Command {

    private final Stereo stereo;

    public StereoOffCommand(final Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
        stereo.on();
    }
}
