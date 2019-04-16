package com.company;

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("Tomato", .27);
        hamburger.addHamburgerAddition2("Lettuce", .75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);

        System.out.println("Total Burger price is " + hamburger.itemizeHamburger() + "\n");

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);

        healthyBurger.addHealthAddition1("Egg", 5.43);
        healthyBurger.addHealthAddition2("Lentils", 3.41);
        System.out.println("Total Healthy burger price is " + healthyBurger.itemizeHamburger() + "\n");

        DeluxeHamburger deluxeBurger = new DeluxeHamburger();
        System.out.println("Total Deluxe burger price is " + deluxeBurger.itemizeHamburger() + "\n");

    }

}
