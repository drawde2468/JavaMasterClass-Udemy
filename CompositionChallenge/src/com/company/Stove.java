package com.company;

public class Stove {

    private String brand;
    private int heatingElements;

    public Stove(String brand, int heatingElements) {
        this.brand = brand;
        this.heatingElements = heatingElements;
    }

    public void setHeatLevel(String elementPosition,String heatLevel){
        System.out.println("Setting the stove " + elementPosition + " element to " + heatLevel);
    }

    public void getStoveInfo(){
        System.out.println("This is a " + getBrand() + " stove with " + getHeatingElements() + " heating elements");
    }

    private String getBrand() {
        return brand;
    }

    private int getHeatingElements() {
        return heatingElements;
    }
}
