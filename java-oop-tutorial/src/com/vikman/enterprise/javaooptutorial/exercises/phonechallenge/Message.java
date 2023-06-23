package com.vikman.enterprise.javaooptutorial.exercises.phonechallenge;

public class Message {
    private String content;
    private Contact sender;
    private Contact receiver;

    public Message(String content, Contact sender, Contact receiver) {
        this.content = content;
        this.sender = sender;
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public Contact getSender() {
        return sender;
    }

    public Contact getReceiver() {
        return receiver;
    }
}
