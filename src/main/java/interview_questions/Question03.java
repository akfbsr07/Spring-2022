package interview_questions;

import java.util.Scanner;

public class Question03 {

             /*
            Example 1: Type code to print just the unique characters in a String
                       "Hello" ==> Heo
        */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a world please");
        String word = scan.nextLine();

        char c = word.charAt(0);
        if (word.indexOf(c) == word.lastIndexOf(c)) {
            System.out.print(c);
        }

        char d = word.charAt(1);
        if (word.indexOf(d) == word.lastIndexOf(d)) {
            System.out.print(d);
        }

        char e = word.charAt(2);
        if (word.indexOf(e) == word.lastIndexOf(e)) {
            System.out.print(e);
        }

        char f = word.charAt(3);
        if (word.indexOf(f) == word.lastIndexOf(f)) {
            System.out.print(f);
        }

        char g = word.charAt(4);
        if (word.indexOf(g) == word.lastIndexOf(g)) {
            System.out.print(g);
        }




    }

    }

