package subsystem;

public class DvdPlayer {
    private boolean isOn = false;

    public void on() {
        isOn = true;
        System.out.println("DVD Player is ON.");
    }

    public void play(String movie) {
        if (!isOn) {
            throw new IllegalStateException("Cannot play movie: DVD Player is OFF.");
        }
        System.out.println("DVD Player is playing: \"" + movie + "\"");
    }

    public void off() {
        isOn = false;
        System.out.println("DVD Player is OFF.");
    }
}