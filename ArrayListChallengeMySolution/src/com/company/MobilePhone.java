package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContact;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContact = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact) {
        if (findContact(contact.getContactName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }

        myContact.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int foundPosition = findContact(oldContact);

        if (foundPosition < 0) {
            System.out.println(oldContact.getContactName() + ", was not found");
            return false;
        }

        this.myContact.set(foundPosition, newContact);
        System.out.println(oldContact.getContactName() + ", was replaced with " + newContact.getContactName());
        return true;
    }

    public boolean removeContact(Contact contact) {
        int foundPosition = findContact(contact);

        if (foundPosition < 0) {
            System.out.println(contact.getContactName() + ", was not found");
            return false;
        }
        this.myContact.remove(foundPosition);
        System.out.println(contact.getContactName() + " was deleted.");
        return true;
    }

    private int findContact(Contact contact) {
        return this.myContact.indexOf(contact);
    }

    private int findContact(String name) {
        for (int i = 0; i < this.myContact.size(); i++) {
            Contact contact = this.myContact.get(i);
            if (contact.getContactName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if (findContact(contact) >= 0) {
            return contact.getContactName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if (position >= 0) {
            return this.myContact.get(position);
        }

        return null;
    }

    public void printContacts() {
        System.out.println("Contact List");
        for (int i = 0; i < this.myContact.size(); i++) {
            System.out.println((i + 1) + "." +
                    this.myContact.get(i).getContactName() + " - " +
                    this.myContact.get(i).getContactNumber()
            );
        }
    }


}
