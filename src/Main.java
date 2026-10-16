import facade.HomeTheaterFacade;

public class Main {
    public static void main(String[] args) {
        // 1. Создаем Фасад. 
        // Клиент вообще ничего не знает про Amplifier, Projector или DvdPlayer!
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        // 2. Включаем всю сложную систему одной простой командой
        homeTheater.watchMovie("Inception");

        // 3. Выключаем всю систему одной простой командой
        homeTheater.endMovie();
    }
}