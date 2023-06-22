package com.vikman.enterprise.javaooptutorial.exercises;

public class Animal {
    private String name;
    private String breed;
    private int legs;
    private boolean hasTail;

    public Animal(String name, String breed, int legs, boolean hasTail) {
        this.name = name;
        this.breed = breed;
        this.legs = legs;
        this.hasTail = hasTail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public boolean isHasTail() {
        return hasTail;
    }

    public void setHasTail(boolean hasTail) {
        this.hasTail = hasTail;
    }
    public void eat(String food){
        System.out.println("Eating "+ food);
    }
}
