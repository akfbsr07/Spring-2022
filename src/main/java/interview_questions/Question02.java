package interview_questions;

import java.util.Scanner;

public class Question02 {

    //Create a simple calculator

    public static void main(String[] args) {

        double num1;
        double num2;
        String operation ="";

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        num1 = scan.nextDouble();
        System.out.println("Enter a second number");
        num2 = scan.nextDouble();
        System.out.println("Enter a mathematical operation");
        operation = scan.next();

        switch(operation) {

            case "+" :
                System.out.println(num1+num2);
                break;
            case "-" :
                System.out.println(num1-num2);
                break;
            case "*" :
                System.out.println(num1*num2);
                break;
            case "/" :
                System.out.println(num1/num2);
                break;
            case "%" :
                System.out.println((num1*num2)/100);
                break;

        }



    }

}