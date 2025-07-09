package smarthome;

public abstract class AbstractDevice implements Device {

    public String name;
    public String room;
    public boolean isOn;

    public AbstractDevice(String name, String room) {
        this.name = name;
        this.room = room;
        this.isOn = true;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getRoom() {
        return room;
    }

    @Override
    public String getStatus() {
        return name + " on Floor " + room + " is " + (isOn ? "on" : "off");
    }
}
