package com.company;

import java.util.Scanner;

public class MobilePhone {

    private Scanner scanner = new Scanner(System.in);

    private Contacts contacts = new Contacts();

    public void addContact() {

        System.out.println("Enter the name of the new contact:");
        String name = scanner.nextLine();
        System.out.println("Enter the phone number of the new contact:");
        String phone = scanner.nextLine();

        this.contacts.createContact(name, phone);
    }

    public void modifyContact() {

        System.out.println("Search for contact to update: ");
        String oldContact = scanner.nextLine();
        System.out.println("Enter the new contact name: ");
        String newContact = scanner.nextLine();
        System.out.println("Enter the new contact phone: ");
        String newPhone = scanner.nextLine();

        this.contacts.modifyContact(oldContact, newContact, newPhone);
        System.out.println("Updated " + oldContact + " to " + newContact + " - " + newPhone);
    }

    public void contactExists() {

        System.out.println("Search for contact: ");
        String contactQuery = scanner.nextLine();
        this.contacts.contactExist(contactQuery);

    }

    public void deleteContact() {

        System.out.println("Search for contact to delete: ");
        String deleteQuery = scanner.nextLine();
        this.contacts.deleteContact(deleteQuery);
        System.out.println(deleteQuery + " deleted.");

    }

    public void showAllContacts(){
        this.contacts.viewContacts();
    }

    public void printIntructions() {
        System.out.println("\n Press");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To view all contacts.");
        System.out.println("\t 2 - To add a contact.");
        System.out.println("\t 3 - To modify a contact.");
        System.out.println("\t 4 - To remove a contact.");
        System.out.println("\t 5 - To search for a contact");
        System.out.println("\t 6 - To quit the application.");
    }


}
