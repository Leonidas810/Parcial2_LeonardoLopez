package objetos.parcial2.examen.smarthome;

public class SmartPlug extends Device {
    public SmartPlug(String string) {
        super(string);
    }
    public void turnOn() {
        System.out.println(getName() + ":"+"Energizando: contacto");
    }
    public void turnOff() {
        System.out.println(getName() + ":"+"Apagando: contacto");
    }
}
