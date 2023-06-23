package com.vikman.enterprise.javaooptutorial.exercises;

public class ElectricCar extends CarAbstractClass implements CarInterface{
    private String carModel;

    public ElectricCar(String carModel) {
        super(carModel);
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
        System.out.println("Electric car started");
    }

    @Override
    public void move(int speed) {
        System.out.println("Electric car moving at speed: "+ speed+ " km/h !");
    }

    @Override
    public void startRadio() {
        System.out.println("Electric car starting radio...");
    }
}
