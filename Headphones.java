public class Headphones implements Device {

    String brand;
    Double price;

    public Headphones(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    public void turnOn() {
        System.out.println("Headphones are ON");
    }

    public void turnOff() {
        System.out.println("Headphones are OFF");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}
