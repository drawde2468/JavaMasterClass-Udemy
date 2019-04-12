package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int currentMax = 0;
        int currentMin = 0;
        boolean firstRun = true;

        while (true) {

            System.out.print("Enter number: ");

            boolean isInputInt = scanner.hasNextInt();

            if (isInputInt) {

                int currentNum = scanner.nextInt();

                if (firstRun) {
                    currentMax = currentNum;
                    currentMin = currentNum;
                    firstRun = false;
                } else {

                    if (currentNum > currentMax) {
                        currentMax = currentNum;
                    }

                    if (currentNum < currentMin) {
                        currentMin = currentNum;
                    }

                }

            }else{
                System.out.println("Invalid input detected... Exiting loop.");
                break;
            }

        }

        System.out.println("Max Number is: " + currentMax);
        System.out.println("Min Number is: " + currentMin);

        scanner.close();

    }
}
