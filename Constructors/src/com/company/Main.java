package com.company;

public class Main {

    public static void main(String[] args) {

//        BankAccount test1 = new BankAccount();
//        BankAccount test2 = new BankAccount("Tim", "Tim@email.com", "5555555555");
//
//        System.out.println(test1.getAccountNumber());
//        System.out.println(test1.getBalance());
//        System.out.println(test1.getCustomerName());
//        System.out.println(test1.getEmail());
//        System.out.println(test1.getPhoneNumber());
//
//        test1.deposit(300);
//        System.out.println(test1.getBalance());
//
//        test1.withdraw(801);
//        System.out.println(test1.getBalance());

        VipCustomer vipOne = new VipCustomer();
        VipCustomer vipTwo = new VipCustomer("Edward", 2000);
        VipCustomer vipThree = new VipCustomer("Tim", 5000, "tim@email.com");

        System.out.println("vipOne");
        System.out.println(vipOne.getName());
        System.out.println(vipOne.getCreditLine());
        System.out.println(vipOne.getEmail());

        System.out.println("vipTwo");
        System.out.println(vipTwo.getName());
        System.out.println(vipTwo.getCreditLine());
        System.out.println(vipTwo.getEmail());

        System.out.println("vipThree");
        System.out.println(vipThree.getName());
        System.out.println(vipThree.getCreditLine());
        System.out.println(vipThree.getEmail());

    }
}
