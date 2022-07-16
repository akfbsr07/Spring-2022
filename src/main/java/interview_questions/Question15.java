package interview_questions;

public class Question15 {

    public static void main(String[] args) {

        //Find the sum of the digits of decimal part in a double number
        //Ex: 23.1528 ==> 1+5+2+8=16

        double num = 234.213123;

        String decimal = String.valueOf(num).split("\\.")[1];
        System.out.println(decimal);
        int decimalPart = Integer.valueOf(decimal);
        int absDecimalPart = Math.abs(decimalPart);
        int sumOfDig = 0;

        for (int i = absDecimalPart ; i > 0; i=i/10) {
            sumOfDig = sumOfDig + i%10;
        }
        System.out.println(sumOfDig);

    }
}
