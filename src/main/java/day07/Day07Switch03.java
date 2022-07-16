package day07;

import java.util.Scanner;

public class Day07Switch03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a letter to check if it is vowel or not");
        char c = input.next().toLowerCase().charAt(0);

        /*Ask user to enter a letter.
        If it is vowel then print "Vowel",
        if it is not vowel then print "Not Vowel",
        if it is not letter print "Please enter a letter". */

        switch (c){

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            case 'b':
            case 'c':
            case 'd':
            case 'f':
            case 'g':
            case 'h':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'p':
            case 'r':
            case 's':
            case 't':
            case 'v':
            case 'y':
            case 'z':
            case 'w':
            case 'x':
                System.out.println("Not Vowel");
                break;
            default:
                System.out.println("Please enter a letter");
        }
    }

}
