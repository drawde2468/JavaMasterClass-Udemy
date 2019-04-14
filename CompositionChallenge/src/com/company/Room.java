package com.company;

public class Room {

    private String name;
    private int sqFT;
    private DishWasher dishWasher;
    private Refrigerator refrigerator;
    private Stove stove;

    public Room(String name, int sqFT, DishWasher dishWasher, Refrigerator refrigerator, Stove stove) {
        this.name = name;
        this.sqFT = sqFT;
        this.dishWasher = dishWasher;
        this.refrigerator = refrigerator;
        this.stove = stove;
    }

    public String getName() {
        return name;
    }

    public int getSqFT() {
        return sqFT;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public Stove getStove() {
        return stove;
    }
}
