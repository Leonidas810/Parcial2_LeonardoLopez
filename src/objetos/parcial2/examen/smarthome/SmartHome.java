package objetos.parcial2.examen.smarthome;

import java.util.LinkedList;

public class SmartHome {
    private LinkedList<Device> devices;
    private String deviceName;
    private String command;
    private String standardCommand;

    public void addDevice(Device device) {
        if(this.devices==null) {
            devices = new LinkedList<>();
        } else{
            devices.add(device);
        }
    }

    public void configure(String deviceName, String command, String standardCommand) {
        for(Device device: devices){
            if(this.deviceName==deviceName){
                this.command=command;
                this.standardCommand=standardCommand;
            }
        }
    }

    public void processCommand(String command) {
        for(Device device: devices){
            if(command==this.command){
                System.out.println(deviceName+standardCommand);
            }
        }
    }
}
