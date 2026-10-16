package subsystem;

public class Lights {
    public void dim(int level) {
        System.out.println("Theater Ceiling Lights dimming to " + level + "%");
    }

    public void on() {
        System.out.println("Theater Ceiling Lights are strictly ON (100%).");
    }
}