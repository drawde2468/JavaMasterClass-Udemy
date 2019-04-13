package com.company;

public class BankAccount {

    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount() {
        this(12345,100,"Default Name","Default Email", "Default Phone");
    }

    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void deposit(double ammount) {
        System.out.println("Current balance is $" + this.balance);
        this.balance += ammount;
        System.out.println("New balance is $" + this.balance);

    }

    public void withdraw(double ammount) {
        if (this.balance - ammount >= 0) {
            System.out.println("Current balance is $" + this.balance);
            this.balance -= ammount;
            System.out.println("New balance is $" + this.balance);
        } else {
            System.out.println("Insufficient Funds");
        }
    }
}
