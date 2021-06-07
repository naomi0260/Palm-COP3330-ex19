package ex19;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Naomi Palm
 */


public class App {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        System.out.print("What is your height in inches? ");
        double height = input.nextInt();
        System.out.print("What is your weight in pounds? ");
        double weight = input.nextInt();

        double heightSquared = height * height;



        double bmi = (weight/heightSquared) *703;

        System.out.printf("Your BMI is %f.\n", bmi);
        if(bmi >= 18.5 && bmi<= 25){
            System.out.print("Your are within the ideal weight range.");
        }else if (bmi < 18.5){
            System.out.print("You are underweight. You should see your doctor.");
        }else{
            System.out.print("You are overweight. You should see your doctor.");
        }

    }
}
