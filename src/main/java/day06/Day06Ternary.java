package day06;

import java.util.Scanner;

public class Day06Ternary {

    public static <Int> void main(String[] args) {

    //Type code to check if a number positive or not
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number...");
        double x= input.nextDouble();

        if (x>0){
            System.out.println("Positive");
        }else {
            System.out.println("Not Positive");
        }

        //2.Way:
        String result = x>0 ? "Positive" : "Not Positive";
        System.out.println(result);

        //Type code to check if an integer has 3 digits or not

        System.out.println("Enter a number...");
        int y = input.nextInt();
        int absY = Math.abs(y);

        String result2 = absY>=100 && absY<=999 ? "3 digit number" : "Not a 3 digit number";
        System.out.println(result2); // if it said double it must y>99 && y<1000 (just 2 checks). In my code there are 4 checks.Use second one always.

        //Type code to chech following conditions for state abbreviations in the USA
        //1)It should have 2 characters
        //2)It should have just uppercase
        System.out.println("Enter a state abbreviation...");
        String s = input.next();
        String result3=(s.length()==2 && s.replaceAll("[A-Z]", "").length()==0) ? "Valid" : "Invalid";
        System.out.println(result3);

    }
}
