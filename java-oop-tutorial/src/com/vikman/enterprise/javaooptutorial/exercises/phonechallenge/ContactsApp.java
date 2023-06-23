package com.vikman.enterprise.javaooptutorial.exercises.phonechallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsApp {
    public ArrayList<Contact> contactsList;

    public ContactsApp(ArrayList<Contact> contactsList) {
        this.contactsList = contactsList;
    }
    public ArrayList<Contact> getContactsList() {
        return contactsList;
    }
    public void addContact(Contact contact){
        this.contactsList.add(contact);
    }
    public void insertContact(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the contact:");
        String name = scanner.next();
        System.out.println("Enter the phone number of the contact:");
        String phoneNumber = scanner.next();
        System.out.println("Enter the address of the contact:");
        String address = scanner.next();
        Contact newContact = new Contact(name, phoneNumber, address, new ArrayList<>());
        this.contactsList.add(newContact);
        System.out.println("Contact registered !");

    }
    public void displayContacts(){
        if(this.contactsList.size() == 0){
            System.out.println("No contacts registered");
            return;
        }
        System.out.println("List of contacts:");
        for (int i =0; i<this.contactsList.size(); i++){
            System.out.println("Index"+ i);
            System.out.println("Name: "+this.contactsList.get(i).getName());
            System.out.println("Phone number: "+this.contactsList.get(i).getPhoneNumber());
        }
    }
    public Contact searchContact(String contactName){
        return this.contactsList.stream().filter(contact -> contact.getName().equalsIgnoreCase(contactName)).findFirst().orElse(null);
    }
    public Contact searchContact(Integer phoneNumber){
        return this.contactsList.stream().filter(contact -> contact.getPhoneNumber().equalsIgnoreCase(phoneNumber.toString())).findFirst().orElse(null);
    }
    public void searchContacts(){
        // TODO: implement fake contacts search
        //
    }
    public boolean removeContact(String contactName){
        boolean success = false;
        for (int i=0; i < this.contactsList.size(); i++){
            if(this.contactsList.get(i).getName().equalsIgnoreCase(contactName)){
                contactsList.remove(i);
                success = true;
                break;
            }
        }
        if(success){
            return true;
        }
        return false;
    }

}
