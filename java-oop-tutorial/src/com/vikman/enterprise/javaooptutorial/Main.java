package com.vikman.enterprise.javaooptutorial;

import com.vikman.enterprise.javaooptutorial.exercises.CarInterface;
import com.vikman.enterprise.javaooptutorial.exercises.ElectricCar;
import com.vikman.enterprise.javaooptutorial.exercises.FossilFuelCar;
import com.vikman.enterprise.javaooptutorial.exercises.School;
import com.vikman.enterprise.javaooptutorial.exercises.Student;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CarInterface teslaCar = new ElectricCar("Tesla");
        teslaCar.start();
        teslaCar.move(60);
        CarInterface toyotaCar = new FossilFuelCar("Toyota");
        toyotaCar.start();
        toyotaCar.move(90);


    }
}
