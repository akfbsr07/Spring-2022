package day07;

import java.util.Scanner;

public class Day07Switch04 {

    public static void main(String[] args) {

        /*Ask user to enter one of the +, -, *, /, % operations and then
          Ask user to enter two values then return the result of the operation
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        double n = input.nextDouble();
        System.out.println("Enter a second number");
        double n2 = input.nextDouble();
        System.out.println("Select an operation");
        char operation = input.next().charAt(0);

        switch (operation){

            case '+':
                System.out.println(n + "+" + n2 + "=" + (n+n2));
                break;

            case '-':
                System.out.println(n + "-" + n2 + "=" + (n-n2));
                break;
            case '*':
                System.out.println(n + "*" + n2 + "=" + (n*n2));
                break;
            case '/':
                System.out.println(n + "/" + n2 + "=" + (n/n2));
                break;
            case '%':
                System.out.println(n + "%" + n2 + "=" + (n*n2/100));
                break;
            default:
                System.out.println("The operation is not defined");

                /*
                   Note 1: String, int, char can be used in switch paranthesis
                   Note 2: boolean, long, float, double can not be used in switch paranthesis
                 */
        }
    }

}
