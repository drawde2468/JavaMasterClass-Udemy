package com.company;

public class Main {

    public static void main(String[] args) {

        // width of int = 32 (4 bytes)
        int myIntValue = 5;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f; //or (float) 5.0
        //width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d; //or 5.0 will assume double

//        System.out.println("myIntValue = " + myIntValue);
//        System.out.println("myFloatValue = " + myFloatValue);
//        System.out.println("myDoubleValue = " + myDoubleValue);

        double pounds = 200d;
        double weightInKG = pounds * 0.45359237;

        System.out.println("weight in KG = " + weightInKG);



    }
}
