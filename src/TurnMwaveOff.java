
public class TurnMwaveOff implements Command {
    ElectronicDevice theDevice;
    public TurnMwaveOff(ElectronicDevice newDevice){
        theDevice = newDevice;
    }
    public void execute() {
        theDevice.off();
    }
    public void undo() {
        theDevice.on();
    }
}
