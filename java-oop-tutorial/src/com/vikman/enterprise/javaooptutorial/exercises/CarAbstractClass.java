package com.vikman.enterprise.javaooptutorial.exercises;

public abstract class CarAbstractClass {
    private String carCommercialName;

    public CarAbstractClass(String carCommercialName) {
        this.carCommercialName = carCommercialName;
    }

    public abstract void startRadio();
    public void turnRadioOff(){
        System.out.println("Radio shutting down");
    }
}
