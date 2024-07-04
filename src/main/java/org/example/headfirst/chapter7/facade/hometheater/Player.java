package org.example.headfirst.chapter7.facade.hometheater;

public interface Player {
    void on();
    void off();
    void play(String movie);
    void stop();
    void eject();
    void pause();
    void setSurroundAudio();
    void setTwoChannelAudio();
    void setVolume(int volume);
}
