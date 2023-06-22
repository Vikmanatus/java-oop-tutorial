package com.vikman.enterprise.javaooptutorial.exercises.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DoctorProgram {
    private List<String> options;
    private boolean quitRequired = false;

    private List<String> generateOptions(Organ[] organs){
        List<String> optionsList = new ArrayList<>();
        for (int i = 0; i< organs.length; i++){
            optionsList.add(organs[i].getName());
        }
        optionsList.add("Quit");
        return optionsList;
    }

    private void printOptions(){
        System.out.println("Choose an option:");
        for (int i =0; i<this.options.size(); i++){
            System.out.println(i+1 +". " + this.options.get(i));
        }
    }
    public void runGame(){
        Eye tomLeftEye = new Eye("Left Eye", "Short sighted","Close the eye", "Blue");
        Eye tomRightEye = new Eye("Right Eye", "Long distance sighted","Inspect the eye", "Blue");
        Heart tomHeart = new Heart("Heart", "Normal", "Change the heart rate", 65);
        Stomach tomStomach = new Stomach("Stomach", "PUD", "Digest");
        Organ tomSkin = new Organ("Skin","Burned");
        Organ[] organs = {tomLeftEye, tomRightEye, tomHeart, tomStomach, tomSkin};
        this.options = this.generateOptions(organs);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter patient name:");
        String patientName = scanner.next();
        System.out.println("Enter patient age:");
        int patientAge = scanner.nextInt();
        Patient tom = new Patient(patientName, patientAge);
        System.out.println("Name: "+ tom.getName());
        System.out.println("Age: "+ tom.getAge());

        do{
            this.printOptions();
            int userChoice = scanner.nextInt();
            if(userChoice == 6){
                this.quitRequired = true;
            }
            Organ organ = null;
            switch (userChoice){
                case 1:
                    organ = tomLeftEye;
                    break;
                case 2:
                    organ = tomRightEye;
                    break;
                case 3:
                    organ = tomHeart;
                    break;
                case 4:
                    organ = tomStomach;
                    break;
                case 5:
                    organ = tomSkin;
                    break;
                default:
                    break;
            }
            if(organ != null){
                this.handleOrganEvents(organ, scanner);
            }

        }while (!this.quitRequired);
    }
    private void handleOrganEvents(Organ organ, Scanner scanner){
        organ.printOrganInformation();
        if(organ.getName().equals("Skin")){
            return;
        }
        int userAction = scanner.nextInt();
        if(userAction == 1){
            if(organ instanceof Heart){
                System.out.println("Enter the new heart rate:");
                int updatedHeartRate = scanner.nextInt();
                organ.runMedicalAction(updatedHeartRate);
            }
            if(organ instanceof Eye){
                organ.runMedicalAction();
            }
            if(organ instanceof Stomach){
                organ.runMedicalAction();
            }
        }
    }

}
