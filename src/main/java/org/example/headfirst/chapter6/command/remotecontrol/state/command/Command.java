package org.example.headfirst.chapter6.command.remotecontrol.state.command;

public interface Command {
    void execute();
    void undo();
}
