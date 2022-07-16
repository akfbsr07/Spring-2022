package interview_questions;

public class Question09 {

    //Example 1: Type integers from 10 to 3 on the console by using for-loop

    public static void main(String[] args) {

        for (int i = 10; i >2 ; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        //Example 2: Type even integers from 4 to 15 on the console by using for-loop

        for (int i = 4; i < 16 ; i++) {
            if (i%2==0){
                System.out.print(i + " " );
            }
        }

        System.out.println();

        //Example 3: Type odd integers from 4 to 15 by using for-loop

        for (int i = 4; i < 16 ; i++) {
            if (i%2!=0){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Example 4: Print all integers from 10 to 32 except 17 on the console

        for (int i = 10; i <33 ; i++) {
            if(i!=17){
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Example 5: Print all integers from 10 to 32 except if the integer is less than 21 greater than 18

        for (int i = 10; i < 33 ; i++) {
            if(i>18 && i<21){
                continue;
            }else {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        //Example 5: Print String characters one by one on the console. If you see "x" stop printing
        //Example: Publix is the best ==> Publi        Tom Hanks ==> Tom Hanks
        String str = "Public is the best but there will be x betters";
        char chr;

        for (int i = 0; i < str.length(); i++) {
            chr = str.charAt(i);
            if (chr=='x'){
                break;
            }else{
                System.out.print(chr + " ");
            }
        }


















    }


}
