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

    public String getDoctorAction() {
        return doctorAction;
    }

    public String getName() {
        return name;
    }

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }
}
