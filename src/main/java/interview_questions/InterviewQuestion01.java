package interview_questions;

import java.util.Scanner;

public class InterviewQuestion01 {

    public static void main(String[] args) {

        //Ask user to enter 2 numbers then swap them
        //a=12 and b=13 ==> a=13 b=12

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double a = input.nextDouble();
        System.out.println("Enter the second number");
        double b = input.nextDouble();

        //1.Way:

        /*double temp = 0;
        temp = b;
        b = a;
        a = temp;
        System.out.println(a);
        System.out.println(b); */

        //2.Way:

       a=a+b;
       b=a-b;
       a=a-b;
        System.out.println(a);
        System.out.println(b);


    }

}
