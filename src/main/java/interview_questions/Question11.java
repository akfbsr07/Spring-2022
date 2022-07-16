package interview_questions;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Question11 {

    //Ask user to enter his full name, then create a unique id for the user
    //Id should contain first 2 characters of the first name and last 2 characters of the last name
    //Use the current date time at the end of the Id
    //Example; Tom Hanks ==> Toks20220528110434

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your full name please");
        String fullName = scan.nextLine();

        String firstTwo = fullName.substring(0,2);
        String lastTwo = fullName.substring(fullName.length()-2);
        LocalDateTime currentDateTime = LocalDateTime.now();
        String expectedCurrentDateTime = currentDateTime.toString().substring(0,19).replaceAll("[^0-9]", "");
        String id = firstTwo+lastTwo+expectedCurrentDateTime;
        System.out.println(id);



    }
}





