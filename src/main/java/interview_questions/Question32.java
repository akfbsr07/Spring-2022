package interview_questions;

public class Question32 {

    /*
    ) Find the total number of characters used in String array elements
Example: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Output is 26
     */

    public static void main(String[] args) {

        String arr[] = {"Kemal", "Jonathan", "Mark", "Angie", "Veli" };
        int length = 0;

        for (int i = 0; i < arr.length; i++) {

            length = length + arr[i].length();

        }
        System.out.println(length);

    }

}
