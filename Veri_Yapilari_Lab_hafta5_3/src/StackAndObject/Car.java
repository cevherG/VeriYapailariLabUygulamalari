
package StackAndObject;

public class Car {
    
    private String model;
    private String brand;
    private int year;

    public Car(String model, String brand, int year) {
        this.model = model;
        this.brand = brand;
        this.year = year;
    }
    
    public void displayCar() {
        System.out.print("Model: " + this.model);
        System.out.print(" Brand :" + this.brand);
        System.out.println(" Year : " + this.year);
    }
    
    
}
