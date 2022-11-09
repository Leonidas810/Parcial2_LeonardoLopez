package objetos.parcial2.examen.smarthome;

import java.util.LinkedList;
import java.util.List;

class DeviceWithCommand{
    Device device;
    String voiceCommand;
    String standardCommand;

    public DeviceWithCommand(Device device, String voiceCommand, String standardCommand){
        this.device=device;
        this.voiceCommand=voiceCommand;
        this.standardCommand=standardCommand;
    }
}

public class SmartHome {
    private final List<Device> devices;
    private final List<DeviceWithCommand> deviceWithCommands;

    public SmartHome (){
        devices=new LinkedList<>();
        deviceWithCommands=new LinkedList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void configure(String deviceName, String voiceCommand, String standardCommand) {
        Device device=findDeviceByName(deviceName);
        if(device!=null){
            DeviceWithCommand deviceWithCommand=new DeviceWithCommand(device,voiceCommand,standardCommand);
            deviceWithCommands.add(deviceWithCommand);
        }else{
            System.out.println("Dispositive Not Exist");
        }
    }

    private Device findDeviceByName(String deviceName){
        for (Device device:devices){
            if (device.getName().equals((deviceName))){
                return device;
            }
        }
        return null;
    }

    public void processCommand(String voiceCommand){
        DeviceWithCommand device= findDeviceByVoiceCommand(voiceCommand);
        if(device==null){
          System.out.println("Dispositive Not Exist");
        }else if(device.standardCommand.equals("turnOn") ){
            device.device.turnOn();
        }else if(device.standardCommand.equals("turnOff")){
            device.device.turnOff();
        }else {
            System.out.println("VoiceCommand Not Exist");
        }
    }

    private DeviceWithCommand findDeviceByVoiceCommand(String voiceCommand) {
        for (DeviceWithCommand deviceWithCommand:deviceWithCommands){
            if(deviceWithCommand.voiceCommand.equals(voiceCommand)){
                     return deviceWithCommand;
            }
        }
        return null;
    }

}
