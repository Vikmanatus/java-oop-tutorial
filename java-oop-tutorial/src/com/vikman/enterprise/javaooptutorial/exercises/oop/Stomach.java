package com.vikman.enterprise.javaooptutorial.exercises.oop;

public class Stomach extends Organ{
    public Stomach(String name, String medicalCondition,String  doctorAction) {
        super(name, medicalCondition, doctorAction);
    }

    public void digest(){
        System.out.println("Digesting begin...");
    }
}
