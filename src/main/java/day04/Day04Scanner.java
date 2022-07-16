package day04;

import java.util.Scanner;

public class Day04Scanner {

    /*
        Scanner Class is used to interact with user
        To interact with the user by using Scanner Class follow the steps:
        1)Create a Scanner Class object
        2)Give a message to the user
        3)Put the data which is coming from user into the memory

     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age...");

        int age = input.nextInt();

        System.out.println(age);

    }


}
