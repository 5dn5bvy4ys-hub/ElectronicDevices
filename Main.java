public class Main {

    public static void main(String[] args) {

        Phone p = new Phone("Samsung", 1500.0);
        Laptop l = new Laptop("Dell", 3000.0);
        Tablet t = new Tablet("Apple", 2000.0);
        SmartWatch s = new SmartWatch("Apple", 800.0);
        Headphones h = new Headphones("Sony", 500.0);

        Device[] devices = {p, l, t, s, h};

        DeviceManager manager = new DeviceManager(devices);

        System.out.println("ALL DEVICES INFORMATION");
        manager.displayAllDevices();

        System.out.println("TURNING ON ALL DEVICES");
        manager.turnOnAllDevices();

        System.out.println("----------------");

        System.out.println("SPECIAL DEVICE FUNCTIONS");

        p.makeCall();
        l.runProgram();
        t.draw();
        s.countSteps();
        h.playMusic();

        System.out.println("----------------");

        System.out.println("CHARGING ALL DEVICES");

        p.charge();
        l.charge();
        t.charge();
        s.charge();
        h.charge();

        System.out.println("----------------");

        System.out.println("TURNING OFF ALL DEVICES");
        manager.turnOffAllDevices();
    }
}
