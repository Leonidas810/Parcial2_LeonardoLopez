package objetos.parcial2.examen.smarthome;

public class SmartLight extends Device {
    public SmartLight(String string) {
        super(string);
    }
    public void turnOn() {
        System.out.println(getName() + ":"+"Encendiendo: foco");
    }
    public void turnOff() {
        System.out.println(getName() + ":"+"Apagando: foco");
    }
}
