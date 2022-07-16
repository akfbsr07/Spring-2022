package interview_questions;

import java.util.Locale;
import java.util.Scanner;

public class Question24 {

    public static void main(String[] args) {

        //Create a String variable for city names which have just a single word.
        //Print the city name with the initial is in uppercase and all the other characters

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a city name please");
        String cityName = scan.next();

        String initial = cityName.substring(0,1);
        initial = initial.toUpperCase();
        String rest = cityName.substring(1);
        rest = rest.toLowerCase();
        System.out.println(initial+rest);


        //Create 3 String variables for people's names. Print the sum of the number of characters in
        //all the 3 names except space characters.
        //Example: If the names are Ali Can, Merve Star, Mark Tom you should see 22 on the console.

        String name1 = "Ali Can";
        String name2 = "Aliye Canan";
        String name3 = "Aliyev Can Cananov";

        name1 = name1.replaceAll(" ","");
        name2 = name2.replaceAll(" ","");
        name3 = name3.replaceAll(" ","");

        int n1 = name1.length();
        int n2 = name2.length();
        int n3 = name3.length();
        System.out.println(n1+n2+n3);







    }

}
