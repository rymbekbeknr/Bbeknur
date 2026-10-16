package facade;

import subsystem.Amplifier;
import subsystem.DvdPlayer;
import subsystem.Lights;
import subsystem.Projector;

public class HomeTheaterFacade {
    private final Amplifier amp;
    private final DvdPlayer dvd;
    private final Projector projector;
    private final Lights lights;

    // Фасад сам инстанцирует подсистему.
    // Это удовлетворяет требованию: Клиент вообще не должен касаться этих классов.
    public HomeTheaterFacade() {
        this.amp = new Amplifier();
        this.dvd = new DvdPlayer();
        this.projector = new Projector();
        this.lights = new Lights();
    }

    // Упрощенный API, который скрывает сложность 7+ шагов
    public void watchMovie(String movie) {
        System.out.println("\n--- Get ready to watch a movie ---");
        try {
            lights.dim(10);
            projector.on();
            projector.wideScreenMode();
            amp.on();
            amp.setVolume(25);
            dvd.on();
            dvd.play(movie);
        } catch (Exception e) {
            System.out.println("Error starting the system: " + e.getMessage());
        }
    }

    // Упрощенный API для выключения
    public void endMovie() {
        System.out.println("\n--- Shutting movie theater down ---");
        lights.on();
        amp.off();
        projector.off();
        dvd.off();
    }
}