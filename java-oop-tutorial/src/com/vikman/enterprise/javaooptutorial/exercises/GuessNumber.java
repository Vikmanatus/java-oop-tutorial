package com.vikman.enterprise.javaooptutorial.exercises;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public void runGame(){
        Random random = new Random();
        final int randomNumber = random.nextInt((10 - 0) + 1);
        boolean isUserReady = false;
        int tries = 0;
        final int MAX_TRIES = 5;
        System.out.println("Welcome to Guess the Price !");

        System.out.println("\n");
        System.out.println("Tell us your name");

        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello "+ userName+ " and thank you for presence today !");
        System.out.println("\n");
        System.out.println("You have 5 tries to guess the correct number");

        while (!isUserReady){
            try {
                System.out.println("Can we start the game ?");
                Scanner startGameScanner = new Scanner(System.in);
                boolean userChoice = startGameScanner.nextBoolean();

                if(userChoice){
                    System.out.println("Lets start the game !");
                    isUserReady = true;
                } else {
                    System.out.println("Dont worry ! We'll wait until you are ready");
                }
            } catch (InputMismatchException e){
                System.out.println("Invalid input!");
                System.out.println("You can type either true or false");
            }
        }

        if(isUserReady){
            System.out.println("And the game begins !");
            System.out.println("What is your first guess ?");
        }

        while (tries < MAX_TRIES){
            try{
                Scanner numberScanner = new Scanner(System.in);
                int userGuess = numberScanner.nextInt();

                if(randomNumber < userGuess){
                    System.out.println("The secret number is lower than your choice");
                    tries+=1;
                }
                if(randomNumber == userGuess){
                    System.out.println("Congratulations ! You win !");
                    break;
                }
                if(randomNumber > userGuess){
                    System.out.println("The secret number is greater than your choice");
                    tries+=1;
                }

            }catch (InputMismatchException e){
                System.out.println("You must enter a number !");
            }
        }

        if(tries >= MAX_TRIES){
            System.out.println("Game over !");
            System.out.println("The secret number was "+ randomNumber);

        }
    }
}