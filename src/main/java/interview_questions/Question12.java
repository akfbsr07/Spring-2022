package interview_questions;

import java.util.Scanner;

public class Question12 {

    public static void main(String[] args) {

        //Type code to print unique characters in a String
        //Alabama ==> Albm
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String to see unique characters");
        String uniques = input.nextLine();

        char chr;

        for (int i = 0; i < uniques.length() ; i++) {
            chr = uniques.charAt(i);
            if (uniques.indexOf(chr)==uniques.lastIndexOf(chr)){
                System.out.print(chr + " ");
            }
        }

         /*
            Type code to print the following image on the console
                    X X X X X
                    X X X X X
                    X X X X X
        */

        System.out.println("Enter number of row please");
        int row = input.nextInt();
        System.out.println("Enter number of column please");
        int column = input.nextInt();

        for (int i = 1; i <= row ; i++) {
            String s = "";
            for (int j = 1; j <= column; j++) {
                s = s + "X ";
            }
            System.out.println(s);
        }


        }
        
        

}
