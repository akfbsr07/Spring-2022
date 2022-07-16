package day07;

import java.util.Scanner;

public class Day07Switch02 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day number");
        int dayNum = input.nextInt();

        //Ask user to enter day number then print all day names with given day name(In USA Sunday is the first day of the week)
        // User 5 ==> Thursday, Friday, Saturday
        // User 3 ==> Tuesday, Wednesday, Thursday, Friday, Saturday


        switch (dayNum) {
            case 1:
                System.out.println("Sunday");

            case 2:
                System.out.println("Monday");

            case 3:
                System.out.println("Tuesday");

            case 4:
                System.out.println("Wednesday");

            case 5:
                System.out.println("Thursday");

            case 6:
                System.out.println("Friday");

            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Enter a valid day number");

        }

    }
}