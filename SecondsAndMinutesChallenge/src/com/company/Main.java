package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945));


    }

    public static String getDurationString(int min, int sec) {

        if (min < 0 || sec < 0 || sec > 59) {
            return "Invalid Value";
        }

        if (min < 60) {
            return ("00h " + min + "m " + sec + "s");
        }

            int hours = min / 60;
            int remainingMin = min % 60;
            return (hours + "h " + remainingMin + "m " + sec + "s");

    }

    public static String getDurationString(int sec) {
        if (sec < 0){
            return "Invalid value";
        }
        if (sec < 60){
            return getDurationString(0, sec);
        }
            int min = sec / 60;
            int remainingSec = sec % 60;
            return getDurationString(min,remainingSec);

    }
}
