package objetos.parcial2.examen.smarthome;

import java.util.LinkedList;

public class SmartHome {
    private LinkedList<Device> devices;

    public void addDevice(Device device) {
        if(this.devices==null) {
            devices = new LinkedList<>();
            devices.add(device);
        } else{
            devices.add(device);
        }
    }
    public void configure(String deviceName, String command, String standardCommand) {
        for(Device device: devices){
            if(device.getName()==deviceName){
                if(standardCommand=="turnOn"){
                    device.configON(command,standardCommand);
                }else{
                    device.configOFF(command,standardCommand);
                }
            }
        }
    }

    public void processCommand(String command) {
        for(Device device: devices){
            if(device.getCommandON()==command) {
                System.out.println(device.getName() + "Encendido:"+ "Switch");
                return;
            } else if(device.getCommandOFF()==command){
                System.out.println(device.getName() + "Apagado:"+ "Switch");
                return;
            }else if(devices.getLast()==device){
                System.out.println("Lo siento, no reconozco el comando");
            }
        }
        }
    }
