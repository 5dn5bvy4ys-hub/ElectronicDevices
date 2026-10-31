public class Main {

    public static void main(String[] args) {

        Phone p = new Phone("Samsung", 1500);
        Laptop l = new Laptop("Dell", 3000);
        Tablet t = new Tablet("Apple", 2000);

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
    }
}
