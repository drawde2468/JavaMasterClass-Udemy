package com.company;

public class Main {

    public static void main(String[] args) {

        BankAccount ed = new BankAccount();
        
        System.out.println(ed.getAccountNumber());
        System.out.println(ed.getBalance());
        System.out.println(ed.getCustomerName());
        System.out.println(ed.getEmail());
        System.out.println(ed.getPhoneNumber());

        ed.deposit(300);
        System.out.println(ed.getBalance());

        ed.withdraw(801);
        System.out.println(ed.getBalance());
    }
}
