package org.example.headfirst.chapter6.command.remotecontrol;

public class RemoteControlTest {
    public static void main(String[] args) {
        final SimpleRemoteControl remote = new SimpleRemoteControl();

        final Light light = new Light();
        final LightOnCommand lightOn = new LightOnCommand(light);

        final GarageDoor garageDoor = new GarageDoor();
        final GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }
}
