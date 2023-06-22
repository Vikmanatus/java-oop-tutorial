package com.vikman.enterprise.javaooptutorial.exercises.oop;

public class Stomach extends Organ{
    public Stomach(String name, String medicalCondition,String  doctorAction) {
        super(name, medicalCondition, doctorAction);
    }
    @Override
    public void runMedicalAction() {
        System.out.println("Digesting begin...");
    }
}
