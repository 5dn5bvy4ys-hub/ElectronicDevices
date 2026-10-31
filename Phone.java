public class Phone implements Device {
  
  String brand;
  Double price;

public Phone(String brand,Double price){
  this.brand = brand;
  this.price = price;
}

public void turnOn(){
  System.out.println("phone iS ON");
}

public void turnOff(){
  System.out.println("phone iS OFF");
}

public void displayInfo(){
  System.out.println("Brand: "+brand);
  System.out.println("Price: "+price);
}
}
