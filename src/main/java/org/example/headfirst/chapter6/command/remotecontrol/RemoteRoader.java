package org.example.headfirst.chapter6.command.remotecontrol;

import org.example.headfirst.chapter6.command.remotecontrol.command.*;
import org.example.headfirst.chapter6.command.remotecontrol.receiver.CeilingFan;
import org.example.headfirst.chapter6.command.remotecontrol.receiver.GarageDoor;
import org.example.headfirst.chapter6.command.remotecontrol.receiver.Light;
import org.example.headfirst.chapter6.command.remotecontrol.receiver.Stereo;

public class RemoteRoader {
    public static void main(String[] args) {
        final RemoteControl remoteControl = new RemoteControl();

        final Light livingRoomLight = new Light("Living Room");
        final Light kitchenLight = new Light("Kitchen");
        final CeilingFan ceilingFan = new CeilingFan("Living Room");
        final GarageDoor garageDoor = new GarageDoor("Garage");
        final Stereo stereo = new Stereo("Living Room");

        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(1, kitchenLight::on, kitchenLight::off);
        remoteControl.setCommand(2, ceilingFan::high, ceilingFan::off);
        remoteControl.setCommand(3, garageDoor::up, garageDoor::down);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.onButtonWasPushed(4);
    }
}
