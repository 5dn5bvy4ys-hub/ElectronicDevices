public class Main {

    public static void main(String[] args) {

        Phone p = new Phone("Samsung", 1500.0);
        Laptop l = new Laptop("Dell", 3000.0);
        Tablet t = new Tablet("Apple", 2000.0);
        SmartWatch s = new SmartWatch("Apple", 800.0);
        Headphones h = new Headphones("Sony", 500.0);

        System.out.println("Phone Information:");
        p.displayInfo();
        p.turnOn();
        p.turnOff();

        System.out.println("----------------");

        System.out.println("Laptop Information:");
        l.displayInfo();
        l.turnOn();
        l.turnOff();

        System.out.println("----------------");

        System.out.println("Tablet Information:");
        t.displayInfo();
        t.turnOn();
        t.turnOff();

        System.out.println("----------------");

        System.out.println("SmartWatch Information:");
        s.displayInfo();
        s.turnOn();
        s.turnOff();

        System.out.println("----------------");

        System.out.println("Headphones Information:");
        h.displayInfo();
        h.turnOn();
        h.turnOff();
    }
}
