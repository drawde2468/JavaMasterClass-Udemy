package com.company;

public class DeluxeHamburger extends Hamburger {

    public DeluxeHamburger() {
        super("Deluxe", "Vegan Bean", 14.54, "Sesame Bun");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drink", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Additions not allowed on deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Additions not allowed on deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Additions not allowed on deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Additions not allowed on deluxe burger");
    }
}
