package com.company;

public class Main {

    public static void main(String[] args) {

        //positive numbers range is the negative number minus 1

	    //int had a width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2147483647;
        int myTotal = (myMinValue/2);
//        System.out.println("myTotal = " + myTotal);


        //byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteVaule = (byte) (myByteValue/2);
//        System.out.println("myNewByteValue = " + myNewByteVaule);

        //has a width of 16
        short myShortValue = -32768;
        short myNewShortValue = (short) (myShortValue/2);
//        System.out.println("myNewShortValue = " + myNewShortValue);

        //long has a width of 64
        long myLongVaule = -9_223_372_036_854_775_808L;

        //test
        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        //long will accept int with no problem
        long longTotal = 50000 + (10 * (myByte + myShort + myInt));
        //most cast type with short and byte
        short shortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));

        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);


    }
}
