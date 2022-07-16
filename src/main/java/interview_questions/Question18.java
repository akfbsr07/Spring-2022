package interview_questions;

import java.util.Scanner;

public class Question18 {

    public static void main(String[] args) {

        //Type code to print the integers divisible by 4 and 6 from 13 to 211
        //1.Way: By using for-loop
        int i = 13;
        while(i<211){

            if (i%4==0 && i%6==0){
                System.out.print(i + " ");
            }
        i++;
        }

        System.out.println();//Type code to print integers from 5 to 13 by using while loop

        int k = 5;
        while(k<14){
            System.out.print(k + " ");

            k++;
        }

        System.out.println();//Type code to check if a given integer is palindrome or not
        //Palindrome: 121 <==> 121        123321 <==> 123321
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to if it is palindrome or not");
        int j = scan.nextInt();

        String sJ = String.valueOf(j);
        String reversedSJ = "";

        int index = sJ.length()-1;
        char chr;

        while(index>-1){
            chr = sJ.charAt(index);
            reversedSJ = reversedSJ + chr;

         index--;
        }

        if (sJ.equals(reversedSJ)){
            System.out.println("Your number is palindrome");
        }else {
            System.out.println("Your number is not palindrome");};

        System.out.println();//Type code to print the sum of the digits of an integer

        System.out.println("Enter a number to find the sum of digits");
        int num = scan.nextInt();
        int sumsum=0;
        while(num>0){
            sumsum=sumsum+num%10;
            num=num/10;
        }
        System.out.println(sumsum);

        System.out.println();//Type code to create a multiplication table for any given number
        //3x1=3   3x2=6   3x3=9   ...   3x9=27   3x10=30
        int a = 3;
        int b = 1;
        while (b<11){
            System.out.print(a + "x" + b + "=" + a*b + " " );
        b++;}

    }

}
