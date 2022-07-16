package interview_questions;

public class Question07 {

    //Type a code to find the number of punctuation marks used in a String.

    public static void main(String[] args) {

        String str = "Wow!... Ali is 13 years old, and he is a university student.";

        String strWithoutPunctuations = str.replaceAll("\\p{Punct}", "");

        int lengthStr = str.length();
        int lengthStrWithoutPunctuations = strWithoutPunctuations.length();
        int numOfPunctuations = lengthStr - lengthStrWithoutPunctuations;
        System.out.println("Number of punctuations = " + numOfPunctuations);

    }

}
