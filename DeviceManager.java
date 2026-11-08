public class DeviceManager {

    Device[] devices;

    public DeviceManager(Device[] devices) {
        this.devices = devices;
    }

    public void displayAllDevices() {

        for (int i = 0; i < devices.length; i++) {

            System.out.println("Device Number: " + (i + 1));

            devices[i].displayInfo();

            System.out.println("----------------");
        }
    }

    public void turnOnAllDevices() {

        for (int i = 0; i < devices.length; i++) {
            devices[i].turnOn();
        }
    }

    public void turnOffAllDevices() {

        for (int i = 0; i < devices.length; i++) {
            devices[i].turnOff();
        }
    }
}
