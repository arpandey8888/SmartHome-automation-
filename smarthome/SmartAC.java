package smarthome;

public class SmartAC extends AbstractDevice {

    public int temp;
    public String mode;

    public SmartAC(String name, String room) {
        super(name, room);
        this.temp = 24;
        this.mode = "cool";
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + "is turned On");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + "is turned off");
    }

    public void setTemp(int temp) {
        if (isOn) {
            if (temp >= 16 && temp <= 30) {
                this.temp = temp;
                System.out.println(name + " temperature set to " + temp);
            }
        }
    }

    public String getStatus() {
        return super.getStatus() + "with temprature " + temp + " and mode " + mode;
    }
}
