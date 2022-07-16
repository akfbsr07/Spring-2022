package day05;

import java.util.Scanner;

public class Day05Modulus {

    /*
         Modulus Operator: % is called 'modulus operator' in Java
                           It returns the remainder in a division operation
                           13 / 5 ==> Modulus operator gives you 3
                           13 % 5 ==> 3

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer...");
        int n = input.nextInt();

        int absN = Math.abs(n);

        //Ask user to enter an integer the print the last digit of the integer on the console
        int lastDigit = absN % 10;
        System.out.println(lastDigit);

        //Ask user to enter his birth year, then print just last 2 digits on the console
        int lastTwoDigits = absN % 100;
        System.out.println(lastTwoDigits);

        //Ask user to enter an integer then check if the number is even
        System.out.println("Is the number even? " + (absN % 2 == 0));

        //Ask user to enter an integer then check if the number is odd
        System.out.println("Is the number odd? " + (absN % 2 != 0));

        //Ask user to enter a 3 digits integer the find the sum of the digits
        int last = absN % 10;

        absN = absN / 10;
        int second = absN % 10;

        absN = absN / 10;
        int first = absN % 10;

        System.out.println(last + second + first);
    }
}






