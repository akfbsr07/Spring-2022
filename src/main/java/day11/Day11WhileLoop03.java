package day11;

public class Day11WhileLoop03 {

    public static void main(String[] args) {

        //Type code to print the sum of the digits of an integer
        int i = 237;
        int sumOfDigits = 0;

        while(i>0){
            sumOfDigits = sumOfDigits + i%10;
            i/=10;
        }
        System.out.println(sumOfDigits);

        //Type code to create a multiplication table for any given number
        //3x1=3   3x2=6   3x3=9   ...   3x9=27   3x10=30
        int k = 132;
        int m = 1;

        while(m<11){
            System.out.println(k + "x" + m + "=" + k*m);
            m++;
        }
    }

}
