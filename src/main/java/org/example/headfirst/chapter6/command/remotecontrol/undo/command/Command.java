package org.example.headfirst.chapter6.command.remotecontrol.undo.command;

public interface Command {
    void execute();
    void undo();
}
