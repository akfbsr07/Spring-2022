package interview_questions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question23 {

    public static void main(String[] args) {

        /*
            Count the words in a String one by one
            String is "Ali came to school, and Ayse came to school."
            Ali=1, came=2, to=2, school=2, and=1, Ayse=1
        */

      String str = "Ali came to school, and Ayse came to school.";
      str = str.replaceAll("[\\p{Punct}]", "");
      String arr[]= str.split(" ");
        System.out.println(Arrays.toString(arr));
int counter = 0;
        for (int i = 1; i < arr.length ; i++) {
            if (arr[i]==arr[i-1]){
                counter++;
                System.out.println(arr[i] + " contains " +counter + " times.");
            }
        }

    }

}
