package com.vikman.enterprise.javaooptutorial;

import com.vikman.enterprise.javaooptutorial.exercises.oop.Database;
import com.vikman.enterprise.javaooptutorial.exercises.phonechallenge.ContactsApp;
import com.vikman.enterprise.javaooptutorial.exercises.phonechallenge.MessagesApp;
import com.vikman.enterprise.javaooptutorial.exercises.phonechallenge.PhoneProgram;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PhoneProgram phoneProgram = PhoneProgram.getInstance(ContactsApp.getInstance(new ArrayList<>()), MessagesApp.getInstance(new ArrayList<>()));
        phoneProgram.runProgram();
    }
}
