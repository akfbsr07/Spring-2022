package interview_questions;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Question34 {

    /*
        Put the browser names in it like CHROME, SAFARI, IE, FIREFOX,
         YANDEX. Use switch statement and print ‘I am using CHROME’ for CHROME,........
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a browser please");
        String browser = scan.next();

        switch (browser.toUpperCase()){

            case "CHROME":
                System.out.println("I am using CHROME");
                break;

            case "SAFARI":
                System.out.println("I am using SAFARI");
                break;

            case "INTERNET EXPLORER":
                System.out.println("I am using INTERNET EXPLORER");
                break;

            case "FIREFOX":
                System.out.println("I am using FIREFOX");
                break;

            case "YANDEX":
                System.out.println("I am using YANDEX");
                break;

            default:
                System.out.println("Your browser is not valid");
        }

    }


}
