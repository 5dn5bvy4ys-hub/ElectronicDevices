public class Laptop implements Device, Chargeable {

    String brand;
    Double price;

    public Laptop(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    public void turnOn() {
        System.out.println("Laptop is ON");
    }

    public void turnOff() {
        System.out.println("Laptop is OFF");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }

    public void charge() {
        System.out.println("Laptop is charging");
    }

    public void runProgram() {
        System.out.println("Laptop is running a program");
    }
}
