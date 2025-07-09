package smarthome;

public class SmartTV extends AbstractDevice {

    public int volume;

    public SmartTV(String name, String room) {
        super(name, room);
        this.volume = 0;
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

    public void setVolume(int volume) {
        if (volume >= 0 && volume <= 100) {
            this.volume = volume;
            System.out.println(name + " volume set to " + volume);
        }
    }

    @Override
    public String getStatus() {
        String status = super.getStatus() + " volume " + volume;
        return status;
    }
}
