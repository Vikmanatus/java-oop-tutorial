package com.vikman.enterprise.javaooptutorial.exercises.phonechallenge;

public abstract class PhoneInterface {
    ContactsApp contactsApp;
    Message message;

    public PhoneInterface(ContactsApp contactsApp) {
        this.contactsApp = contactsApp;
    }

}
