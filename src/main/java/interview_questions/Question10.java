package interview_questions;

public class Question10 {

    public static void main(String[] args) {

        //Interview Question
        //Type code to reverse a String
        //Tom Hanks ==> sknaH moT

        String str = "Tom Hanks";
        char chr;
        String reversed = "";

        for (int i = str.length()-1 ; i > -1 ; i--) {
            chr = str.charAt(i);

             reversed = reversed + chr;
        }

        System.out.println(reversed);






        }




    }

