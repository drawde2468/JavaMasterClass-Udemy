package com.company;

public class Printer {

    private int tonerLevel;
    private int numOfPagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel > -1 && tonerLevel <= 100) {
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.isDuplex = isDuplex;
        this.numOfPagesPrinted = 0;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 0 && tonerAmount <= 100) {
            if (this.tonerLevel + tonerAmount > 100) {
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;

        if (this.isDuplex) {
            pagesToPrint = (pages / 2) + (pages % 2);
            System.out.println("Printing in duplex mode");
        }
        this.numOfPagesPrinted += pagesToPrint;
        return pagesToPrint;
    }

    public int getNumOfPagesPrinted() {
        return numOfPagesPrinted;
    }

    //    public Printer(double tonerLevel, boolean isDuplex) {
//        this.tonerLevel = tonerLevel;
//        this.numOfPagesPrinted = 0;
//        this.isDuplex = isDuplex;
//    }
//
//    public void fillToner(){
//        System.out.println("Filling toner to 100%");
//        this.tonerLevel = 100;
//    }
//
//    public void printPage(int numPages){
//        double inkUsed = numPages * .5;
//
//        if (this.tonerLevel - inkUsed > 0){
//            this.tonerLevel -= inkUsed;
//            this.numOfPagesPrinted += numPages;
//            System.out.println("Printing "+ numPages + " pages");
//            System.out.println("New ink levels "+ this.tonerLevel + "%");
//        } else if(this.tonerLevel - inkUsed == 0){
//            System.out.println("Printing "+ numPages + " pages");
//            System.out.println("You just ran out of ink.");
//        } else{
//            System.out.println("You don't have enough ink for this print job!");
//        }
//
//
//    }


}
