package com.vikman.enterprise.javaooptutorial;

import com.vikman.enterprise.javaooptutorial.exercises.GuessNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phone iPhone = new Phone("iPhone 11",5,8, 8);
        System.out.println(iPhone.getName());
        iPhone.playMusing("California Love");

        Bird phoenix = new Bird("Phoenix", "Golden", 2, false, 2);
        System.out.println(phoenix.getName());
        phoenix.eat("worms");

        phoenix.fly();
        phoenix.fly(130);
    }
}
