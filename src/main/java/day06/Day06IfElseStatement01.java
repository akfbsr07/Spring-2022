package day06;

import java.util.Scanner;

public class Day06IfElseStatement01 {

    /*
          If the score is less than 50 then you will fail
          If the score is greater than or equal to 50 then you will pass

          If the score is less than 50 then you will fail otherwise you will pass
                          CONDITION            ACTION 1                ACTION 2

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score");
        int score = input.nextInt();
        //Ask user to enter the score, if the score is less than 50 print "Fail"" otherwise print "Pass" on the console

        if (score < 50) {
            System.out.println("Fail");
        } else {
            System.out.println("Pass");
        }

        //2.Way: Multiple If, not recommended
        if (score < 50) {
            System.out.println("Fail");
        }
        if (score >= 50) {
            System.out.println("Pass");
        }

        //Ask user to enter the number of day, then print the name of the day
        //Example: 2 ==> Tuesday

        System.out.println("Enter the number of the day");
        short dayNum = input.nextShort();

        if (dayNum == 1) {
            System.out.println("Monday");
        } else if (dayNum == 2) {
            System.out.println("Tuesday");
        } else if (dayNum == 3) {
            System.out.println("Wednesday");
        } else if (dayNum == 4) {
            System.out.println("Thursday");
        } else if (dayNum == 5) {
            System.out.println("Friday");
        } else if (dayNum == 6) {
            System.out.println("Saturday");
        } else if (dayNum == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Please enter a valid day number");
        }


    }

}