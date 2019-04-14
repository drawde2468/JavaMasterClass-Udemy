package com.company;

public class VolkswagenJettaTDI extends Car {

    private String color;
    private String transmission;

    public VolkswagenJettaTDI(String color, String transmission) {
        super(130, "Sedan", 4, 4, "Diesel");
        this.color = color;
        this.transmission = transmission;
    }

    @Override
    public void info() {
        System.out.println("This Volkswagen Jetta TDI is " + this.color + " and has a " + this.transmission + " transmission");
        super.info();
    }
}
