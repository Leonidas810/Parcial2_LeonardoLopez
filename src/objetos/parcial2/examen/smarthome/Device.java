package objetos.parcial2.examen.smarthome;

public abstract class Device extends SmartHome{
    private final String name;
    private String commandOn;
    private String commandOff;
    private String standardCommandOn;
    private String standardCommandOff;

    public Device(String name){
        this.name=name;
    }
    public abstract void turnOn();
    public abstract void turnOff();

    public String getName() {
         return name;
    }

    public void configON(String command, String standardCommand) {
        this.commandOn=command;
        this.standardCommandOn=standardCommand;
    }

    public void configOFF(String command, String standardCommand) {
        this.commandOff=command;
        this.standardCommandOff=standardCommand;
    }

    public String getCommandON() {
        return commandOn;
    }
    public String getCommandOFF() {
        return commandOff;
    }
}
