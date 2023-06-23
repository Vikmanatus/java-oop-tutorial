package com.vikman.enterprise.javaooptutorial.exercises;

public class ElectricCar implements CarInterface{
    private String carModel;

    public ElectricCar(String carModel) {
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
        System.out.println("Car started");
    }

    @Override
    public void move(int speed) {
        System.out.println("Car moving at speed: "+ speed+ " km/h !");
    }
}
