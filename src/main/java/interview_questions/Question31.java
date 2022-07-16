package interview_questions;

import java.util.Scanner;

public class Question31 {

    /*
      Type Apex code by using nested ternary.
      Write a program to check if a year is a leap year or not.
      If the year is divisible by 100 then it must be divisible by 400.
      If a year is not divisible by 100 then it must be divisible by 4.

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a year to see that if it is leap year or not");
        int year = scan.nextInt();

        String leap = year%100==0 ? year%400==0 ? "It is a leap year" : "It is not leap year" : year%4==0 ? "It is a leap year" : "İt is not leap year";
        System.out.println(leap);


    }



}
