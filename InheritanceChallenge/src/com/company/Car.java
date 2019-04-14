package com.company;

public class Car extends Vehicle {

    private String bodyType;
    private int wheels;
    private int doors;
    private String fuel;

    public Car(int topSpeedMPH, String bodyType, int wheels, int doors, String fuel) {
        super(topSpeedMPH, "Land");
        this.bodyType = bodyType;
        this.wheels = wheels;
        this.doors = doors;
        this.fuel = fuel;
    }

    @Override
    public void info() {
        System.out.println("This " + this.bodyType + " has " + this.wheels + " wheels and runs on " + this.fuel + " fuel.");
        super.info();
    }
}
