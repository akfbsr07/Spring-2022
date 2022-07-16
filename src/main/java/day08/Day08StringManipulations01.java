package day08;

public class Day08StringManipulations01 {

    public static void main(String[] args) {

       /*
        If your code gives you correct output for some data, it is not giving correct output for other data
        it cannot be accepted. That kind of codes are called "Hard Coding"

        If your code works for all data it is called "Dynamic Code". Everytime you must make your code "Dynamic Code"
     */



            //Example 1: Count the alphabetical characters in a given String
            // Tom12 Hanks!... ==> 8
            String name = "Tom12 Hanks!...    Hi?,,   ";
            int numOfLetters = name.replaceAll("[^A-Za-z]", "").length();
            System.out.println(numOfLetters);

            //Example 2: Get the initials from full name. (Middle name is out of scope)
            //Tom Hanks ==> TH   -  tom hanks ==> TH  -  "   tOM Hanks   " ==> TH
            String fullName = "Tom Hanks";

            //trim() method removes the spaces just from the beginning and from the end. It does not touch spaces in the middle
            //substring(startingIndex, endingIndex) method is used to get a specific part of a String.
            //startingIndex is inclusive, endingIndex is exclusive
            //Note 1: The variables used inside the method parenthesis are called "Parameters"
            //Note 2: The values you used inside the method parenthesis are called "Arguments"
            String initialOfFirstName = fullName.trim().substring(0, 1).toUpperCase();

            //split() method is used to split a String into specific parts by using a specific character or characters
            //The character you used to split the String will not be visible after splittin
            String initialOfLastName = fullName.trim().split(" ")[1].substring(0, 1).toUpperCase();
            System.out.println(initialOfFirstName + initialOfLastName);

            //Example 3: Fix the day names format like "Sunday"
            //"sunday" ==> Sunday       -      "SUNDAY" ==> Sunday      -         "   sUNDAY  " ==> Sunday
            String dayName = "   sunday  ";
            String initialOfDayName = dayName.trim().substring(0, 1).toUpperCase();
            String otherCharsOfDayName = dayName.trim().substring(1).toLowerCase();
            System.out.println(initialOfDayName + otherCharsOfDayName);

            //Example 4: Make the all digits except last 4 digits of a credit card invisible by using '*'
            // 1234 1234 1234 1234 ==> **** **** **** 1234
            //Note 1: \\S ==> Different from space (Uppercase means 'different from')
            //Note 2: \\s ==> This has positive meaning, I mean space character
            String creditCardNumber = "1234 1234 1234 1234";
            String invisiblePart = creditCardNumber.substring(0, 15).replaceAll("\\S", "*");
            String visiblePart = creditCardNumber.substring(15);
            System.out.println(invisiblePart + visiblePart);//**** **** **** 1234

            //Example 5: Count how many characters different from space were used in a String
            //"Tom Hanks was born in 1975."
            //1.Way:
            String s = "Tom Hanks was born in 1975.";
            int numOfChars = s.replace(" ", "").length();
            System.out.println(numOfChars);
            //2.Way:
            Integer numOfCharacters = s.replace(" ", "").split("").length;
            System.out.println(numOfCharacters);











    }

}
