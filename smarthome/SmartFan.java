package smarthome;

public class SmartFan extends AbstractDevice {

    public int speed;

    public SmartFan(String name, String room) {
        super(name, room);
        this.speed = 0;
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

    public void setSpeed(int speed) {
        if (speed >= 1 && speed <= 3) {
            this.speed = speed;
            System.out.println(name + " fan speed set to " + speed);
        }
    }

    @Override
    public String getStatus() {
        String status = super.getStatus();
        if (isOn) {
            status += " at speed " + speed;
        }
        return status;
    }
}
