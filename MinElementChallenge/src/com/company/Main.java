package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a desired array length:");
        int[] myArray = readIntegers(scanner.nextInt());

        System.out.println("Array is : " + Arrays.toString(myArray));
        System.out.println("The min is : "+ findMin(myArray));
    }

    private static int[] readIntegers(int numbers) {

        int[] newArray = new int[numbers];

        System.out.println("Enter " + numbers + " numbers:\r");
        for (int i = 0; i < numbers; i++) {
            int temp = scanner.nextInt();
            scanner.nextLine();
            newArray[i] = temp;
        }
        return newArray;
    }

    private static int findMin(int[] array) {

        int currentMin = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array.length == 1) {
                return currentMin;
            } else if (currentMin > array[i]) {
                currentMin = array[i];
            }
        }
        return currentMin;
    }
}
