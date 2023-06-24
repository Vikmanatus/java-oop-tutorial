package com.vikman.enterprise.javaooptutorial.exercises.phonechallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class MessagesApp {
    public ArrayList<Message> messagesList;
    private static MessagesApp instance;
    public static MessagesApp getInstance(ArrayList<Message> messagesList) {
        if(instance == null){
            instance = new MessagesApp(messagesList);
        }
        return instance;
    }
    public MessagesApp(ArrayList<Message> messagesList) {
        this.messagesList = messagesList;
    }

    public ArrayList<Message> getMessagesList() {
        return messagesList;
    }

    public void displayMessages(){
        if(this.messagesList.size() == 0){
            System.out.println("No messages registered");
            return;
        }
        System.out.println("List of messages:");
        for (int i =0; i<this.messagesList.size(); i++){
            System.out.println("Index: "+ this.messagesList.get(i));
            System.out.println("Receiver: "+this.messagesList.get(i).getReceiver().getName());
            System.out.println("Sender: "+this.messagesList.get(i).getSender().getName());
            System.out.println("Content: "+ this.messagesList.get(i).getContent());
        }
    }

    public void sendMessage(ContactsApp contactsApp){
        Scanner scanner = new Scanner(System.in);
        if(contactsApp.getContactsList().size() == 0){
            System.out.println("You have no contacts. Please register a contact before continuing");
            return;
        }
        System.out.println("Please select the index of the contact you wish to send a message");
        System.out.println("\n");
        contactsApp.displayContacts();
        System.out.println("\n");
        int contactIndex = scanner.nextInt();
        Contact requestedContact = contactsApp.getContactsList().get(contactIndex);
        Contact sender = contactsApp.getContactsList().get(0);
        System.out.println("Please enter the content of your message:");
        String content = scanner.next();
        this.messagesList.add(new Message(content,sender, requestedContact));
        System.out.println("Message sent !");
    }
}
