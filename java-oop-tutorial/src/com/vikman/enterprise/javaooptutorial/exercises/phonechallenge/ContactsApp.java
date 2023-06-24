package com.vikman.enterprise.javaooptutorial.exercises.phonechallenge;

import com.vikman.enterprise.javaooptutorial.exercises.oop.Database;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactsApp {
    public ArrayList<Contact> contactsList;
    private static ContactsApp instance;
    public static synchronized ContactsApp getInstance(ArrayList<Contact> contactsList) {
        if(instance == null){
            instance = new ContactsApp(contactsList);
        }
        return instance;
    }
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
        System.out.println("Enter the email of the contact:");
        String email = scanner.next();
        Contact newContact = new Contact(name, phoneNumber, address,email, new ArrayList<>());
        this.contactsList.add(newContact);
        System.out.println("Contact registered !");

    }
    private void displayContact(Contact contact, int index){
        System.out.println("Index"+ index);
        System.out.println("Name: "+contact.getName());
        System.out.println("Phone number: "+contact.getPhoneNumber());
    }
    private void displayContact(Contact contact){
        System.out.println("Name: "+contact.getName());
        System.out.println("Phone number: "+contact.getPhoneNumber());
    }
    public void displayContacts(){
        if(this.contactsList.size() == 0){
            System.out.println("No contacts registered");
            return;
        }
        System.out.println("List of contacts:");
        for (int i =0; i<this.contactsList.size(); i++){
            this.displayContact(this.contactsList.get(i), i);
        }
    }
    private Contact searchContactByName(String contactName){
        return this.contactsList.stream().filter(contact -> contact.getName().equalsIgnoreCase(contactName)).findFirst().orElse(null);
    }
    private Contact searchContactByEmail(String email){
        return this.contactsList.stream().filter(contact -> contact.getPhoneNumber().equalsIgnoreCase(email)).findFirst().orElse(null);
    }
    private void performSearch(Scanner scanner, String message){
        System.out.println(message);
        String contactName = scanner.next();
        Contact searchedContact = this.searchContactByName(contactName);
        if(searchedContact == null){
            System.out.println("No contact found");
            return;
        }
        System.out.println("Found match");
        this.displayContact(searchedContact);
    }
    private void performSearch(Scanner scanner){
        System.out.println("Please enter the email of the contact");
        String contactEmail = scanner.next();
        Contact searchedContact = this.searchContactByEmail(contactEmail);
        if(searchedContact == null){
            System.out.println("No contact found");
            return;
        }
        System.out.println("Found match");
        this.displayContact(searchedContact);
    }
    public void searchContacts(){
        System.out.println("Please enter how you would like to perform the search:");
        System.out.println("1. By contact name");
        System.out.println("2. By email");
        Scanner scanner = new Scanner(System.in);
        int userChoice = scanner.nextInt();
        if(userChoice == 1){
            // Search
            this.performSearch(scanner, "Please enter the contact name");
            return;
        }
        if (userChoice == 2){
            this.performSearch(scanner);
        }
        return;
    }
    public void deleteContact(){
        this.displayContacts();
        System.out.println("Please enter the name of the contact you want to delete");
        Scanner scanner = new Scanner(System.in);
        String contactName = scanner.next();
        boolean isContactRemoved = this.removeContact(contactName);
        if(isContactRemoved){
            System.out.println("Contact successfully deleted");
            return;
        }
        System.out.println("Something wrong happened, we could not delete the contact. Please try again later");
    }
    private boolean removeContact(String contactName){
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
