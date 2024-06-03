package org.example.headfirst.chapter6.command.remotecontrol;

import org.example.headfirst.chapter6.command.remotecontrol.command.GarageDoorUpCommand;
import org.example.headfirst.chapter6.command.remotecontrol.command.LightOnCommand;
import org.example.headfirst.chapter6.command.remotecontrol.receiver.GarageDoor;
import org.example.headfirst.chapter6.command.remotecontrol.receiver.Light;

public class RemoteControlTest {
    public static void main(String[] args) {
        final SimpleRemoteControl remote = new SimpleRemoteControl();

        final Light light = new Light("Living Room");
        final LightOnCommand lightOn = new LightOnCommand(light);

        final GarageDoor garageDoor = new GarageDoor("Garage");
        final GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
