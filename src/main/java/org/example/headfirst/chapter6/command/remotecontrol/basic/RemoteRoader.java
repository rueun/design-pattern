package org.example.headfirst.chapter6.command.remotecontrol.basic;


import org.example.headfirst.chapter6.command.remotecontrol.basic.command.*;
import org.example.headfirst.chapter6.command.remotecontrol.basic.receiver.CeilingFan;
import org.example.headfirst.chapter6.command.remotecontrol.basic.receiver.GarageDoor;
import org.example.headfirst.chapter6.command.remotecontrol.basic.receiver.Light;
import org.example.headfirst.chapter6.command.remotecontrol.basic.receiver.Stereo;

public class RemoteRoader {
    public static void main(String[] args) {
        final RemoteControl remoteControl = new RemoteControl();

        final Light livingRoomLight = new Light("Living Room");
        final Light kitchenLight = new Light("Kitchen");
        final CeilingFan ceilingFan = new CeilingFan("Living Room");
        final GarageDoor garageDoor = new GarageDoor("Garage");
        final Stereo stereo = new Stereo("Living Room");

        final LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        final LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        final LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        final LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        final CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        final CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        final GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        final GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        final StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        final StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, garageDoorUp, garageDoorDown);
        remoteControl.setCommand(4, stereoOnWithCD, stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.undoButtonWasPushed();
    }
}
