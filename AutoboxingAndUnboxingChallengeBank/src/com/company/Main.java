package com.company;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Lehman Brothers");

        bank.addBranch("New York");

        bank.addCustomer("New York", "Ed", 100.87);
        bank.addCustomer("New York", "Mike", 12.34);
        bank.addCustomer("New York", "John", 77.39);

        bank.addBranch("Montgomery");
        bank.addCustomer("Montgomery", "Bob", .57);

        bank.addCustomerTransaction("Montgomery", "Bob", 85.32);
        bank.addCustomerTransaction("New York", "Ed", 85.32);
        bank.addCustomerTransaction("New York", "Ed", 85.32);

        bank.listCustomer("New York", false);
        bank.listCustomer("New York", true);
    }
}
