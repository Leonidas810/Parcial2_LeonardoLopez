package objetos.parcial2.examen.smarthome;

public class SmartSwitch extends Device{
    public SmartSwitch(String string) {
        super(string);
    }
    public void turnOn() {
        System.out.println(getName() + ":"+"Encendido: Switch");
    }

    public void turnOff() {
        System.out.println(getName() + ":"+"Apagando: Switch");
    }
}
