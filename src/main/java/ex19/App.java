package ex19;

import java.util.Scanner;

/*
Create a program to calculate the body mass index (BMI) for a person using the person’s height in inches and weight in pounds. The program should prompt the user for weight and height.

Calculate the BMI by using the following formula:

bmi = (weight / (height × height)) * 703
If the BMI is between 18.5 and 25, display that the person is at a normal weight. If they are out of that range, tell them if they are underweight or overweight and tell them to consult their doctor.

Example Output
Your BMI is 19.5.
You are within the ideal weight range.
or

Your BMI is 32.5.
You are overweight. You should see your doctor.
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
