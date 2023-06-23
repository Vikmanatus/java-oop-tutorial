package com.vikman.enterprise.javaooptutorial;

import com.vikman.enterprise.javaooptutorial.exercises.oop.Database;

public class Main {
    public static void main(String[] args) {
        Database mongoDb = Database.getInstance("MongoDB");
        System.out.println(mongoDb.getName());
        System.out.println(mongoDb.toString());
    }
}
