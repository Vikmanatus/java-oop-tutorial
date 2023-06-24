package com.vikman.enterprise.javaooptutorial.exercises.phonechallenge;


import java.util.ArrayList;
import java.util.Scanner;

public class PhoneProgram {
    private static PhoneProgram instance;
    private ContactsApp contactsApp;
    private MessagesApp messagesApp;
    public static synchronized PhoneProgram getInstance(ContactsApp contactsApp,MessagesApp messagesApp ) {
        if(instance == null){
            instance = new PhoneProgram(contactsApp,messagesApp);
        }
        return instance;
    }

    public PhoneProgram(ContactsApp contactsApp, MessagesApp messagesApp) {
        this.contactsApp = contactsApp;
        this.messagesApp = messagesApp;
    }

    private void displayContactsMenu(){
        System.out.println("1. Show all contacts");
        System.out.println("2. Add new contact");
        System.out.println("3. Search for a contact");
        System.out.println("4. Delete a contact");
        System.out.println("5. Go back to the previous menu");
    }
    private void displayMessagesMenu(){
        System.out.println("1. See the list of all messages");
        System.out.println("2. Send a new message");
        System.out.println("3. Go back to the previous menu");
    }
    private void handleContactsOption(){
        Scanner contactAction = new Scanner(System.in);
        int userSelection = contactAction.nextInt();
        switch (userSelection){
            case 1:
                this.contactsApp.displayContacts();
                break;
            case 2:
                this.contactsApp.insertContact();
                break;
            case 3:
                this.contactsApp.searchContacts();
                break;
            case 4:
                this.contactsApp.deleteContact();
                break;
            case 5:
                break;
            default:
                break;
        }
    }
    private void handleMenuOption(){
        Scanner messageAction = new Scanner(System.in);
        int userSelection = messageAction.nextInt();
        switch (userSelection){
            case 1:
                this.messagesApp.displayMessages();
                break;
            case 2:
                this.messagesApp.sendMessage(this.contactsApp);
                break;
            case 3:
                break;
            default:
                break;
        }
    }
    public void runProgram(){
        boolean quitRequested = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to your awesome phone");
        while (!quitRequested){
            System.out.println("\n");
            System.out.println("1. Manage contacts");
            System.out.println("2. Messages");
            System.out.println("3. Quit");
            int userChoice = scanner.nextInt();

            switch (userChoice){
                case 1:
                    this.displayContactsMenu();
                    this.handleContactsOption();
                    break;
                case 2:
                    this.displayMessagesMenu();
                    this.handleMenuOption();
                    break;
                case 3:
                    quitRequested = true;
                    break;
                default:
                    break;
            }
        }

    }
}
