package interview_questions;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Question25 {

    public static void main(String[] args) {


        // Type code to print
        // a) "Winter" for December, January, February
        // b) "Spring" for March, April, May
        // c) "Summer" for June, July, August
        // d) "Fall" for September, October, November
        // e) "Invalid month name" for all the others

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a month please");
        String month = scan.next().toLowerCase();
        switch (month){

            case "december":
            case "january" :
            case "february":
                System.out.println("Winter");
                break;
            case "march":
            case "april" :
            case "may":
                System.out.println("Spring");
                break;
            case "june":
            case "july" :
            case "august":
                System.out.println("Summer");
                break;
            case "september":
            case "october" :
            case "november":
                System.out.println("Fall");
                break;

            default:
                System.out.println("Enter a valid month please");

        }

    }
}