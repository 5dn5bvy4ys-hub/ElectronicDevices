public class Laptop implements Device {
  String brand;
  Double price;

public Laptop(String brand,Double price) {
  this.brand = brand;
  this.price = price;
}

public void turnOn() {
  System.out.println("Laptop is oN");
}

public void turnOff() {
  System.out.println("Laptop is OFF");
}

public void displayInfo() {
  System.out.println("Brand: "+ brand);
   System.out.println("price: "+ price);
  
   }
}
