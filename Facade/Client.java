package Facade;

public class Client {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();

        Facade theatre = new Facade(amplifier, dvdPlayer, projector);

        theatre.watchMovie("Inception");
    }
}
