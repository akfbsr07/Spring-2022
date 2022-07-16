package interview_questions;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Question19 {

    public static void main(String[] args) {

         /*
          Ask user to enter an integer.
		  If the integer is less than 100, tell user "Won!"
		  Otherwise, tell user "Lost!"
         */

        Scanner scan = new Scanner(System.in);

        do{
            System.out.println("Enter an integer please");
            int user = scan.nextInt();
            if (user>99){
                System.out.println("Lost!");
                break;
            }System.out.println("Won!");

        }while(true);




    }

}
