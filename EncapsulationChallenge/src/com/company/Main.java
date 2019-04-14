package com.company;

public class Main {

    public static void main(String[] args) {

        Printer printerOne = new Printer(50, false);

        System.out.println("Initial Page Count = " + printerOne.getNumOfPagesPrinted());

        int pagesPrinted = printerOne.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + ". New total print count for printer = " + printerOne.getNumOfPagesPrinted());

        pagesPrinted = printerOne.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + ". New total print count for printer = " + printerOne.getNumOfPagesPrinted());
    }
}
