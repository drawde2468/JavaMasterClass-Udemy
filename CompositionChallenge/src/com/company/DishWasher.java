package com.company;

public class DishWasher {

    private String brand;
    private String interiorMaterial;

    public DishWasher(String brand, String interiorMaterial) {
        this.brand = brand;
        this.interiorMaterial = interiorMaterial;
    }

    public void setWashCycle(String cycle) {
        System.out.println("Starting a " + cycle + " cleaning cycle");
    }

    public void getDishwasherInfo() {
        System.out.println("This is a " + getBrand() + " dishwasher with " + getInteriorMaterial() + " interior lining.");
    }

    private String getBrand() {
        return brand;
    }

    private String getInteriorMaterial() {
        return interiorMaterial;
    }
}
