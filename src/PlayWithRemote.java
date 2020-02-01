
import java.util.ArrayList;
import java.util.List;

public class PlayWithRemote{
	
    public static void main(String[] args){
        ElectronicDevice newDevice =Remote.getDevice();
        TurnMwaveOn onCommand = new TurnMwaveOn(newDevice);
        DeviceButton onPressed = new DeviceButton(onCommand);
        onPressed.press();
        TurnMwaveOff offCommand = new TurnMwaveOff(newDevice);
        onPressed = new DeviceButton(offCommand);
        onPressed.press();
       
        Microwave theMwave = new Microwave();
        List<ElectronicDevice> allDevices = new ArrayList<ElectronicDevice>();

        allDevices.add(theMwave);
 
        TurnItAllOff turnOffDevices = new TurnItAllOff(allDevices);
        DeviceButton turnThemOff = new DeviceButton(turnOffDevices);
        turnThemOff.press();
        turnThemOff.pressUndo();
    }
}
