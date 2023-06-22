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
