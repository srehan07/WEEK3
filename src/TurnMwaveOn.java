public class TurnMwaveOn implements Command {
    ElectronicDevice theDevice;
    public TurnMwaveOn(ElectronicDevice newDevice){
        theDevice = newDevice;
    }
    public void execute() {
        theDevice.on();
    }
    public void undo() {
        theDevice.off();
    }
}
