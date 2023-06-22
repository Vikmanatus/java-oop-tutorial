package com.vikman.enterprise.javaooptutorial.exercises.oop;

public class Eye extends Organ{
    private String color;

    public Eye(String name, String medicalCondition,String doctorAction, String color) {
        super(name, medicalCondition, doctorAction);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void closeEye(){
        System.out.println(this.getName()+ " closed");
    }
}
