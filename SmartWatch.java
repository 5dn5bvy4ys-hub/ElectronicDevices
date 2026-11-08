public class SmartWatch implements Device, Chargeable {

    String brand;
    Double price;

    public SmartWatch(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    public void turnOn() {
        System.out.println("SmartWatch is ON");
    }

    public void turnOff() {
        System.out.println("SmartWatch is OFF");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public void charge() {
        System.out.println("SmartWatch is charging");
    }

    public void countSteps() {
        System.out.println("SmartWatch is counting steps");
    }
}
