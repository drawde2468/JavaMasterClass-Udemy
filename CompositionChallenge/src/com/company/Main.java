package com.company;

public class Main {

    public static void main(String[] args) {

        Room kitchen = new Room("Kitchen", 150,
                new DishWasher("Samsung", "Stainless Steel"),
                new Refrigerator("Kenmore", "White", "Glass"),
                new Stove("Samsung", 4));

        System.out.println("***Refrigerator***");
        kitchen.getRefrigerator().getFridgeInfo();
        kitchen.getRefrigerator().setTempLevel(8);

        System.out.println("\n" + "***Stove***");
        kitchen.getStove().getStoveInfo();
        kitchen.getStove().setHeatLevel("Bottom-Left", "Medium");

        System.out.println("\n" + "***Dishwasher***");
        kitchen.getDishWasher().getDishwasherInfo();
        kitchen.getDishWasher().setWashCycle("Heavy");

    }
}
