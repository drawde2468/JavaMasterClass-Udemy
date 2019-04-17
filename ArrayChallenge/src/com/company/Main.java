package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = getIntegers(5);
        int[] sortedArray = sortIntegers(myArray);

        printArray(sortedArray);

    }

    private static int[] getIntegers(int arrLength) {

        int[] array = new int[arrLength];

        System.out.println("Enter " + arrLength + " numbers: \r");

        for (int i = 0; i < arrLength; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " has a value of " + array[i]);
        }
    }

    private static int[] sortIntegers(int[] notSortedArr) {
//        int[] sortedArr = new int[notSortedArr.length];
//
//        for (int i = 0; i < notSortedArr.length; i++) {
//            sortedArr[i] = notSortedArr[i];
//        }

        int[] sortedArr = Arrays.copyOf(notSortedArr,notSortedArr.length);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArr.length - 1; i++) {
                if (sortedArr[i] < sortedArr[i + 1]) {
                    temp = sortedArr[i];
                    sortedArr[i] = sortedArr[i + 1];
                    sortedArr[i + 1] = temp;
                    flag = true;
                }
            }


        }


//         start     1,2,3,4,5
//                0  2,1,3,4,5
//                1  2,3,1,4,5
//                2  2,3,4,1,5
//                3  2,3,4,5,1
//                4  3,2,4,5,1
//                5  3,4,2,5,1
//                6  3,4,5,2,1
//                7  4,3,5,2,1
//                8  4,5,3,2,1
//         end    9  5,4,3,2,1


        return sortedArr;
    }
}
