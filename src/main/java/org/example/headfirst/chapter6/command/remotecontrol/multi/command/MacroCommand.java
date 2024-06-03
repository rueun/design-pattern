package org.example.headfirst.chapter6.command.remotecontrol.multi.command;

public class MacroCommand implements Command {

    private Command[] commands;

    public MacroCommand(final Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for (Command command : commands) {
            command.undo();
        }
    }
}
