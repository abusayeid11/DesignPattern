package Facade;

public class Facade {
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;

    public Facade(Amplifier amplifier, DVDPlayer dvdPlayer, Projector projector){
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
    }

    public void watchMovie(String movie){
        System.out.println(movie + " starting...");
        amplifier.on();
        dvdPlayer.on();
        projector.on();
    }
}
