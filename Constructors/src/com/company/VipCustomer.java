package com.company;

public class VipCustomer {

    private String name;
    private double creditLine;
    private String email;

    public VipCustomer(){
        this("Default Name", 1000, "Default Email");
    }

    public VipCustomer(String name, double creditLine){
        this(name, creditLine, "Unknown Email");
    }

    public VipCustomer(String name, double creditLine, String email){
        this.name = name;
        this.creditLine = creditLine;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLine() {
        return creditLine;
    }

    public String getEmail() {
        return email;
    }
}
