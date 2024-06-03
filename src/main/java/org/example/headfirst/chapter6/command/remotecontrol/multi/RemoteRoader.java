package org.example.headfirst.chapter6.command.remotecontrol.multi;


import org.example.headfirst.chapter6.command.remotecontrol.multi.command.*;
import org.example.headfirst.chapter6.command.remotecontrol.multi.receiver.Light;
import org.example.headfirst.chapter6.command.remotecontrol.multi.receiver.Stereo;

public class RemoteRoader {
    public static void main(String[] args) {
        final RemoteControl remoteControl = new RemoteControl();

        final Light livingRoomLight = new Light("Living Room");
        final Stereo stereo = new Stereo("Living Room");

        final LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        final LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

        final StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        final StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        Command[] partyOn = {livingRoomLightOn, stereoOnWithCD};
        Command[] partyOff = {livingRoomLightOff, stereoOff};

        final MacroCommand partyOnMacro = new MacroCommand(partyOn);
        final MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();
    }
}
