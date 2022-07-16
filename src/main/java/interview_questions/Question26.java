package interview_questions;

import java.util.Scanner;

public class Question26 {

    public static void main(String[] args) {

        //Type code to print
        // a) "Valid Password" if the password has at least 8 characters different from space
        // character
        // b) "Do not use space character in password" if the password has any space
        // character in any position
        // c) "Invalid Password" if a and b conditions are not satisfied
        // Note: Be careful about the orders of conditions in the solution

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a password please");
        String password = scan.nextLine();

        String lengthPassword = password.replaceAll(" ", "");
         if(lengthPassword.length()>8){
            System.out.println("Valid Password");
        }else {
             System.out.println("Invalid password");
         }
         if(password.length()!=lengthPassword.length()){
            System.out.println("Do not use space characters in the password");
            System.out.println("Invalid password");
        }else System.out.println("Password accepted");

         String valid = "true";



    }

}
