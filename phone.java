public class phone implements Device {
  
  String brand;
  Double price;

public phone(String brand,Double price){
  this.brand = brand;
  this.price = price;
}

public void turnOn(){
  System.out,println("phone id ON");
}

public void turnOff(){
  System.out.println("phone id OFF");
}

public void displayInfo(){
  System.out.println("Brand: "+brand);
  System.out.println("Price: "+price);
}
}
