package day05;

import java.util.Scanner;

public class Day05IfStatement {

    /*
        If your score is less than 50 then you will fail
        if(condition){
            <The code to be executed if the condition is true>
        }
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer...");
        int n = input.nextInt();


        if(3>4){
            System.out.println("It is true");
        }

        //Type code to chech if the integer got from user is divided by 3 or not
            if(n%3==0){
                System.out.println("The number is divided by 3");
            }

            if (n%3!=0){
                System.out.println("The number is can not divided by 3");
            }

            //Type code to check if the first digit of a 3 digits integer is less than 5
            //If it is less than 5 print 'perfect number' otherwise print 'good number'

            if(n/100<5){
                System.out.println("Perfect number");
            }

            if (n/100>=5){
                System.out.println("Good number");
            }

            System.out.println("Enter the initial of an any day name");
            String s = input.next();

            if(s.equals("S")){
                System.out.println("Saturday and Sunday");
            }

            if(s.equals("T")) {
            System.out.println("Tuesday and Thursday");
            }
            if(s.equals("W")) {
                System.out.println("Wednesday");
            }
            if(s.equals("F")) {
                    System.out.println("Friday");
            }
            if(s.equals("M")) {
                        System.out.println("Monday");
            }

    }

}
