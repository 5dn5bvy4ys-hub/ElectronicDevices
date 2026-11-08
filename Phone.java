public class Phone implements Device, Chargeable {

    String brand;
    Double price;

    public Phone(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    public void turnOn() {
        System.out.println("Phone is ON");
    }

    public void turnOff() {
        System.out.println("Phone is OFF");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public void charge() {
        System.out.println("Phone is charging");
    }

    public void makeCall() {
        System.out.println("Phone is making a call");
    }
}
