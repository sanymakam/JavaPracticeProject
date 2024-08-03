package org.example;

public class Car {
    // Fields
    String color;
    String model;

    // Constructor
    public Car(String color, String model) {
        this.color = color;
        this.model = model;
    }

    // Method
    public void displayInfo() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }

    public static void main(String[] args) {
        // Creating an object of Car class
        int i = 10;
        Car myCar = new Car("Red", "Tesla Model 3");

        // Using the object
        myCar.displayInfo();
    }

}

