package Bridge;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device){
        this.device = device;
    }

    void turnOn(){
        device.turnOn();
    }

    void turnOff(){
        device.turnOff();
    }
}
