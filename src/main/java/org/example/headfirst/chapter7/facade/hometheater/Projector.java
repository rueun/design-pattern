package org.example.headfirst.chapter7.facade.hometheater;

public class Projector {
    public void on() {
        System.out.println("Top-O-Line Projector on");
    }

    public void off() {
        System.out.println("Top-O-Line Projector off");
    }

    public void wideScreenMode() {
        System.out.println("Top-O-Line Projector in widescreen mode (16x9 aspect ratio)");
    }

    public void tvMode() {
        System.out.println("Top-O-Line Projector in tv mode (4x3 aspect ratio)");
    }
}
