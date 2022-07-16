package interview_questions;

public class Question13 {

    public static void main(String[] args) {

        /* Print the following structure on the console
                   Week: 1
                     Day: 1
                     Day: 2
                     Day: 3

                   Week: 2
                     Day: 1
                     Day: 2
                     Day: 3
                */

        int week = 4;
        int day = 7;

        for (int i = 1; i < 5 ; i++) {

            System.out.println("Week: "+i);
            for (int j = 1; j < 8; j++) {
                System.out.println("Day: " +j);
            }

        }

    }

}
