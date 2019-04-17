package com.company;

import java.util.Scanner;

public class Main {

    private static MobilePhone mobilePhone = new MobilePhone();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean end = false;
        int userChoice = 0;

        mobilePhone.printIntructions();

        while (!end) {
            System.out.println("Select an option:");
            userChoice = scanner.nextInt();

            switch (userChoice) {
                case 0:
                    mobilePhone.printIntructions();
                    break;
                case 1:
                    mobilePhone.showAllContacts();
                    break;
                case 2:
                    mobilePhone.addContact();
                    break;
                case 3:
                    mobilePhone.modifyContact();
                    break;
                case 4:
                    mobilePhone.deleteContact();
                    break;
                case 5:
                    mobilePhone.contactExists();
                    break;
                case 6:
                    end = true;
                    break;
            }
        }

    }

}
