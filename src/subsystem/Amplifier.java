package subsystem;

public class Amplifier {
    private int volume;

    public void on() {
        System.out.println("Amplifier is ON.");
    }

    public void setVolume(int volume) {
        if (volume < 0 || volume > 100) {
            throw new IllegalArgumentException("Volume must be between 0 and 100.");
        }
        this.volume = volume;
        System.out.println("Amplifier volume set to " + volume);
    }

    public void off() {
        System.out.println("Amplifier is OFF.");
    }
}