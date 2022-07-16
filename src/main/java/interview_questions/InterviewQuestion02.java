package interview_questions;

import java.util.Scanner;

public class InterviewQuestion02 {

    public static void main(String[] args) {

        //Get two integers from user and replace them

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer please");
        int a = scan.nextInt();
        System.out.println("Enter a second integer please");
        int b = scan.nextInt();
        System.out.println("int a= " + a);
        System.out.println("int b= " + b);

        int c = 0;
        c = a;
        a = b;
        b = c;

        System.out.println("int a= " + a);
        System.out.println("int b= " + b);

    }

}
