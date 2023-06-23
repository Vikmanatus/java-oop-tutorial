package com.vikman.enterprise.javaooptutorial.exercises;

public class FossilFuelCar extends CarAbstractClass implements CarInterface{
    private String carModel;

    public FossilFuelCar(String carModel) {
        this.carModel = carModel;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    @Override
    public void start() {
        System.out.println("The fossil fuel car is starting");
    }

    @Override
    public void move(int speed) {
        System.out.println("Fossil car moving at speed: "+ speed+ " km/h !");
    }

    @Override
    public void startRadio() {
        System.out.println("Fossil car starting radio...");
    }
}
