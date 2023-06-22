package com.vikman.enterprise.javaooptutorial.exercises.oop;

public class Heart extends Organ{
    private int heartRate;

    public Heart(String name, String medicalCondition,String  doctorAction , int heartRate) {
        super(name, medicalCondition, doctorAction);
        this.heartRate = heartRate;
    }
    public void changeHeartRate(int newHeartRate){
        this.heartRate = newHeartRate;
        System.out.println("Heart rate changed to: "+ this.heartRate);
    }

    public int getHeartRate() {
        return heartRate;
    }
}
