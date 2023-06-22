package com.vikman.enterprise.javaooptutorial;

public class Bird extends Animal {
    private int wings;

    public Bird(String name, String breed, int legs, boolean hasTail, int wings) {
        super(name, breed, legs, hasTail);
        this.wings = wings;
    }

    @Override
    public void eat(String food) {
        System.out.println("These "+ food +" are delicious !");
    }
    public void fly(){
        System.out.println(this.getName() + " is flying !");
    }
    public void fly(int speed){
        System.out.println(this.getName()+ " is flying at "+ speed + "km/h");
    }
}
