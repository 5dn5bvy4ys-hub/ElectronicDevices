public class Tablet implements Device {

    String brand;
    Double price;

    public Tablet(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    public void turnOn() {
        System.out.println("Tablet is ON");
    }

    public void turnOff() {
        System.out.println("Tablet is OFF");
    }

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}
