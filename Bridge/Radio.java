package Bridge;

public class Radio implements Device{
    @Override
    public void turnOn() {
      System.out.println("Radio turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Radio turned off");
    }

    @Override
    public void setVolume(int percent) {
        System.out.println("Radio Volume changed to " + percent + "%");
    }
}
