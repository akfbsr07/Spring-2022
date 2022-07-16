package day06;

import java.util.Scanner;

public class Day06NestedTernary {

    public static void main(String[] args) {



        /*Type java code by using nested ternary.
                Write a program to check if a year is leap year or not.
                If the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.*/


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year...");
        int year = input.nextInt();

        String result = year % 100 == 0 ? (year % 400 == 0 ? "Leap" : "Not Leap") : (year % 4 == 0 ? "Leap" : "Not Leap");
        System.out.println(result);

        //What if ternary returns different data types?
        String s = "Tom Hanks";

        System.out.println(s.startsWith("K") ? s.length() : String.valueOf(s.charAt(0)));
        //If you have different data types in "Ternary" , to see output on the console you can put the Ternary directly inside the System.out.println()

        /*
          startsWith() method checks the initial in the String
         */

       String result2= s.startsWith("T") ? String.valueOf(s.length()) : String.valueOf(s.charAt(0)); //if it is mandatory to create a container for the result of the ternary, convert data types to same data type
                                                                     //String.valueOf method.It can turns every data type value to String.

        System.out.println(result2);



    }
}
