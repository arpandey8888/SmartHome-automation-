package smarthome;

public interface Device {
    String getName();
    String getRoom();
    void turnOn();
    void turnOff();
    String getStatus();
}
