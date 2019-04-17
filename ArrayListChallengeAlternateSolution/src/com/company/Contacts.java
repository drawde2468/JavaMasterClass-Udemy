package com.company;

import java.util.ArrayList;

public class Contacts {

    private ArrayList<String> contactName = new ArrayList<>();
    private ArrayList<String> contactPhone = new ArrayList<>();

    public void createContact(String name, String phone) {
        int position = this.findContactPosition(name);

        if (position < 0) {
            this.contactName.add(name);
            this.contactPhone.add(phone);
            System.out.println("Created new contact " + name + " - " + phone);
        } else {
            System.out.println("Error contact already exists!");
        }

    }

    private int findContactPosition(String name) {
        return this.contactName.indexOf(name);
    }

    public void modifyContact(String oldContactName, String newContactName, String newContactPhone) {
        int position = findContactPosition(oldContactName);

        if (position >= 0) {
            this.contactName.set(position, newContactName);
            this.contactPhone.set(position, newContactPhone);
        } else {
            System.out.println("Contact not found!");
        }
    }

    public void deleteContact(String contactName) {
        int position = this.findContactPosition(contactName);

        if (position >= 0) {
            this.contactName.remove(position);
            this.contactPhone.remove(position);
        } else {
            System.out.println("Contact not found!");
        }
    }

    public void contactExist(String name) {
        int position = this.findContactPosition(name);

        if (position >= 0) {
            System.out.println(name + " - " + this.contactPhone.get(position));
        } else {
            System.out.println(name + " does not exist.");
        }
    }

    public void viewContacts() {
        System.out.println("You have " + this.contactName.size()+ " contacts on your mobile phone.");
        for (int i = 0; i < this.contactName.size(); i++) {
            System.out.println(i + 1 + ". " + this.contactName.get(i) + " - " + this.contactPhone.get(i));
        }
    }

}
