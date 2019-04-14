package com.company;

public class Refrigerator {

    private String brand;
    private String exteriorFinish;
    private String shelveType;

    public Refrigerator(String brand, String exteriorFinish, String shelveType) {
        this.brand = brand;
        this.exteriorFinish = exteriorFinish;
        this.shelveType = shelveType;
    }

    public void setTempLevel(int tempLevel) {
        System.out.println("Setting temperature to " + tempLevel + " level");
    }

    public void getFridgeInfo() {
        System.out.println("This is a " + getExteriorFinish() + " " + getBrand() + " refrigerator with " + getShelveType() + " type shelves.");
    }

    private String getBrand() {
        return brand;
    }

    private String getExteriorFinish() {
        return exteriorFinish;
    }

    private String getShelveType() {
        return shelveType;
    }
}
