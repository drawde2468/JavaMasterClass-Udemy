package com.company;

public class Vehicle {

    private int topSpeedMPH;
    private String transportType;

    Vehicle(int topSpeedMPH, String transportType) {
        this.topSpeedMPH = topSpeedMPH;
        this.transportType = transportType;
    }

    public void info() {
        System.out.println("The vehicle's top speed is " + this.topSpeedMPH + " on " + this.transportType);
    }

}
