package Bridge;

public class AdvanceRemoteControl extends RemoteControl{

    public AdvanceRemoteControl(Device device) {
        super(device);
        
    }

    void setVolume(int percent){
        device.setVolume(percent);
    }
    
}
