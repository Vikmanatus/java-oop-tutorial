package com.vikman.enterprise.javaooptutorial.exercises.oop;

public class Organ {
    private String name;
    private String medicalCondition;

    private String doctorAction;
    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    public Organ(String name, String medicalCondition, String doctorAction) {
        this.name = name;
        this.medicalCondition = medicalCondition;
        this.doctorAction = doctorAction;
    }
    public void printOrganInformation(){
        System.out.println("Name: "+ this.getName());
        System.out.println("Medical condition: "+ this.getMedicalCondition());
        if(this instanceof Heart){
            System.out.println("Heart rate: "+ ((Heart) this).getHeartRate());
        }
        if(this instanceof Eye){
            System.out.println("Color: "+ ((Eye) this).getColor());
        }
        if(this instanceof Stomach){
            System.out.println("Need to be fed");
        }
        if(this.getDoctorAction() != null){
            System.out.println("        1. "+ this.getDoctorAction());
        }

    }
    public void runMedicalAction(){
        // Nothing to do
    }
    public void runMedicalAction(int newHeartRate) {

    }
    public String getDoctorAction() {
        return doctorAction;
    }

    public String getName() {
        return name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }


}
