package com.company;

public class Main {

    public static void main(String[] args) {

        //Sting behaves like a primitive data type but actually is a class.

        String myString = "This is a string";
        myString = myString + ", and this is more.";
        myString = myString + " \u00A9 2015";


        System.out.println(myString);

        String numberString = "250.55";
        numberString = numberString + "49.55";

        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;

        System.out.println(lastString);
    }
}
