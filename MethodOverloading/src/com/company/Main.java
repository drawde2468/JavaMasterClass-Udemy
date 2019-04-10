package com.company;

public class Main {

    public static void main(String[] args) {

//        int newScore = calculateScore("Edward", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(75);
//        calculateScore();
//        calcFeetAndInchesToCentimeters(0, -);
        calcFeetAndInchesToCentimeters(-10);

    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if (feet < 0 || inches < 0 || inches > 12) {
            System.out.println("Invalid ft or inches parameters");
            return -1;
        }
        double centimeters = ((feet * 12) + inches) * 2.54;
        System.out.println(feet +" ft "+ inches + " inches is " + centimeters + " centimeters");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {

        if (inches < 0) {
            System.out.println("Invalid number of inches");
            return -1;
        }

        double feet = (int) inches / 12;
        double inchRemainder = inches % 12;
        return calcFeetAndInchesToCentimeters(feet, inchRemainder);

    }

//    public static int calculateScore (String playerName, int score){
//        System.out.println("Player " + playerName + " scored " + score + " points");
//        return score * 1000;
//    }
//
//    public static int calculateScore (int score){
//        System.out.println("Unnamed player scored " + score + " points");
//        return score * 1000;
//    }
//    public static int calculateScore (){
//        System.out.println("Unnamed player scored, no player score");
//        return 0;
//    }
}
