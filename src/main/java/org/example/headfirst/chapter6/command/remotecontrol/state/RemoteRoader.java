package org.example.headfirst.chapter6.command.remotecontrol.state;


import org.example.headfirst.chapter6.command.remotecontrol.state.command.*;
import org.example.headfirst.chapter6.command.remotecontrol.state.receiver.CeilingFan;

public class RemoteRoader {
    public static void main(String[] args) {
        final RemoteControl remoteControl = new RemoteControl();
        final CeilingFan ceilingFan = new CeilingFan("Living Room");

        final CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        final CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        final CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
        final CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
        remoteControl.setCommand(2, ceilingFanLow, ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(2);
        System.out.println(remoteControl);
    }
}
