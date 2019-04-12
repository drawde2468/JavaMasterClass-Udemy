package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int counter = 1;
        int sum = 0;

        while (counter <= 10) {

            System.out.print("Enter number #" + counter + ": ");
            boolean isInputInt = scanner.hasNextInt();

            if (isInputInt) {
                int numInput = scanner.nextInt();
                sum += numInput;
                counter++;
            }else{
                System.out.println("Invalid input!");
            }

            scanner.nextLine();

        }

        System.out.println("The sum is equal to " + sum);

        scanner.close();
    }
}
