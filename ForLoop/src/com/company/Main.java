package com.company;

public class Main {

    public static void main(String[] args) {

//        for (int i = 2; i < 9; i++) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
//        }

//        for (int i = 8; i >= 2; i--) {
//            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
//        }

        for(int i = 10, count = 0; i < 50;i++){
            if (count == 10){
                System.out.println("Exiting the loop");
                break;
            }
            if(isPrime(i)) {
                System.out.println(i + " is a prime number");
                count++;
            } else {
                System.out.println(i + " is NOT a prime number");
            }
        }

    }

    public static boolean isPrime (int n){
        if(n == 1){
            return false;
        }

        for(int i = 2; i <= (long) Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }

    public static double calculateInterest(double amount, double interestrate) {
        return (amount * (interestrate / 100));
    }
}
