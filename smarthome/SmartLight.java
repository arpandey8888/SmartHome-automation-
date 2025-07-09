package smarthome;

public class SmartLight extends AbstractDevice {

    public SmartLight(String name, String room) {
        super(name, room);
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + "is turned On");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + "is turned Off");
    }

    @Override
    public String getStatus() {
        return super.getStatus();
    }
}
