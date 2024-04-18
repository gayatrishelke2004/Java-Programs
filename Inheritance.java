class Vehicle {
  protected String make = "Ford";        
  public void soundHorn() {             
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String model = "Mustang";       
  public static void main(String[] args) {

    Car myFastCar = new Car();

    
    myFastCar.soundHorn();

  
    System.out.println(myFastCar.make + " " + myFastCar.model);
  }
}
