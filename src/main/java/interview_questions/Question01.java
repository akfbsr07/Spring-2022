package interview_questions;

import java.util.Scanner;

public class Question01 {

    //Ask user to their weight and height and type a program with calculates mass index
    //
    //HINT : Body Mass Index = Weight (kg) / Square of height (m)
    //Then give a message to user as following:
    //
    //If BMI is less than 18.5 , you re weak If BMI is between 18.5 and 25 , your weight is ideal If BMI is between 25 and 30, you re fat If BMI is more than or equal to 30, obese

    public static void main(String[] args) {

        double weight;
        double height;
        double bmi;


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your weight in kilogram...");
        weight = scan.nextDouble();
        System.out.println("Please enter your height in meter...");
        height = scan.nextDouble();
        bmi = calculateBmi(weight, height);
        if(bmi<18.5){
            System.out.println("You are weak.");
        } else if (bmi<25) {
            System.out.println("Your weight is ideal");
        } else if (bmi<30) {
            System.out.println("You are fat");
        }else{
            System.out.println("You are obese.");
        }

    }

    public static double calculateBmi(double weight, double height) {
         return weight / (height * height);
    }
}
