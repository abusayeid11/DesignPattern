package Bridge;

public class Client {
    public static void main(String[] args) {
        Device tv = new TV();
        RemoteControl basicRemote = new RemoteControl(tv);
        basicRemote.turnOn();
        basicRemote.turnOff();

        Device radio = new Radio();
        AdvanceRemoteControl advancedRemote = new AdvanceRemoteControl(radio);
        advancedRemote.turnOn();
        advancedRemote.setVolume(50);
        advancedRemote.turnOff();
    }
}
