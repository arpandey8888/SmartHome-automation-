package smarthome;

import java.util.*;

public class SmartController {

    private List<Device> devices;

    public SmartController() {
        devices = new ArrayList<>();
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public void ControllDevice(String name, boolean turnOn) {
        for (Device device : devices) {
            if (device.getName().equals(name)) {
                if (turnOn) {
                    device.turnOn();
                } else {
                    device.turnOff();
                }
                return;
            }
        }
    }

    public void setACTemperature(String name, int temp) {
        for (Device device : devices) {
            if (device.getName().equalsIgnoreCase(name)) {
                if (device instanceof SmartAC) {
                    ((SmartAC) device).setTemp(temp);
                    return;
                } else {
                    System.out.println("The device is not an AC.");
                    return;
                }
            }
        }
        System.out.println("AC device not found.");
    }

    public void showAllStatuses() {
        for (Device device : devices) {
            System.out.println(device.getStatus());
        }
    }

    public List<Device> getDevices() {
        return devices;
    }
}
