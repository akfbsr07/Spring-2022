package interview_questions;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Question04 {

    /*
            Check if a password has the following conditions
              i)It should not be empty
              ii)It should not be just a single space
              iii)It should not have spaces at the beginning and at the end
              iv)'i' should be a character in the password and first occurrence of 'i' should be at index 4
              v)'K' should be a character in the password and last occurrence of 'K' should be at index 5
        */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your password please");
        String password = scan.nextLine();

        if (!password.isEmpty()) {
            System.out.println("Your password is not empty.");}
        else{
            System.out.println("Your password can not be empty");}

        if (!password.isBlank()) {
            System.out.println("Your password is not blank.");}
        else {
            System.out.println("Your password can not be blank");}

        if (password.trim().equals(password)){
            System.out.println("Your password do not have spaces at the beginning and at the end");}
        else {
            System.out.println("Your password can not have spaces at the beginning and at the end");}

        if (password.indexOf("i")==4){
            System.out.println("Your password has i at index 4 at the first time");}
        else {
            System.out.println("Your password should have i first time at the index 4");}

        if (password.lastIndexOf("K")==5){System.out.println("Your password has K at index 5 at the last time");
            System.out.println("Welcome to the Lehmann Bank");;}
        else {
            System.out.println("Your password should have K last time at the index 5");}













    }
}
