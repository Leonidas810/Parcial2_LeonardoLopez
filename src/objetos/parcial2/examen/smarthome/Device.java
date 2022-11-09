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
}
