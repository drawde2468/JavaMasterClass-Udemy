package com.company;

public class Main {

    public static void main(String[] args) {

//        int count = 1;
//
//        while (count != 6){
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        while (true){
//            if(count == 6){
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        count = 1;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//        } while (count !=6);

        int number = 4;
        int finishedNumber = 20;
        int evenNumbers = 0;

        while (number <= finishedNumber){
            number++;
            if (evenNumbers == 5){
                break;
            }

            if(!isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
            evenNumbers++;
        }

    }

    public static boolean isEvenNumber(int n){
        return (n % 2 == 0);
    }
}
