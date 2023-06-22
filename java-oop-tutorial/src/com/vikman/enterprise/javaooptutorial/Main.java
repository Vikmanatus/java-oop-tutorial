package com.vikman.enterprise.javaooptutorial;

import com.vikman.enterprise.javaooptutorial.exercises.GuessNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] students = new String[5];
        students[0] = "Tom";
        students[1] = "Jerry";
        students[2] = "Inspector Gadget";
        students[3] = "Spider-man";
        students[4] = "Hulk";


        String[] heroes = {"Batman", "Flash", "Superman","WonderWoman", "Batgirl"};
        for (int i =0; i < heroes.length; i++){
            System.out.println(heroes[i]);
        }
        System.out.println("Enter your favorite super hero name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for(int i =0; i<heroes.length; i++){
            if(name.equals(heroes[i])){
                System.out.println(heroes[i]);
            }
        }
    }
}
