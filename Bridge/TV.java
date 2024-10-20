package Bridge;

public class TV implements Device{

    @Override
    public void turnOn() {
      System.out.println("Tv turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv turned off");
    }

    @Override
    public void setVolume(int percent) {
        System.out.println("TV volume changed to " + percent + "%");
    }
    
}
