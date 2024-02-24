package org.example.c06.ArrayList;

import java.util.ArrayList;


public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("1234567890");

        mobilePhone.addNewContact(Contact.createContact("Bob", "31415926"));
        mobilePhone.addNewContact(Contact.createContact("Alice", "16180339"));
        mobilePhone.addNewContact(Contact.createContact("Tom", "11235813"));
        mobilePhone.addNewContact(Contact.createContact("Jane", "23571113"));
        mobilePhone.printContacts();

        System.out.println("Querying contact Bob:");
        Contact queriedContact = mobilePhone.queryContact("Bob");
        if (queriedContact != null) {
            System.out.println("Contact found: " + queriedContact.getName() + " -> " + queriedContact.getPhoneNumber());
        } else {
            System.out.println("Contact not found.");
        }
        Contact newContact = Contact.createContact("Bobby", "98765432");
        mobilePhone.updateContact(Contact.createContact("Bob", "31415926"), newContact);
        mobilePhone.printContacts();

        mobilePhone.removeContact(newContact);
        mobilePhone.printContacts();
    }

    public boolean addNewContact(Contact contact) {

        if (findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {

        int foundPosition = findContact(oldContact);
        if (foundPosition < 0) {
            System.out.println(oldContact.getName() + ", was not found.");
            return false;
        } else if (findContact(newContact.getName()) != -1) {
            System.out.println("Contact with name " + newContact.getName() +
                    " already exists.  Update was not successful.");
            return false;
        }

        this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact) {

        int foundPosition = findContact(contact);
        if (foundPosition < 0) {
            System.out.println(contact.getName() + ", was not found.");
            return false;
        }

        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + ", was deleted.");
        return true;
    }

    private int findContact(Contact contact) {
        return myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {

        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String name) {

        int position = findContact(name);
        if (position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }

    public void printContacts() {

        System.out.println("Contact List:");
        for (int i = 0; i < this.myContacts.size(); i++) {
            System.out.println((i + 1) + ". " +
                    this.myContacts.get(i).getName() + " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }
}

class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber) {
        return new Contact(name, phoneNumber);
    }
}

