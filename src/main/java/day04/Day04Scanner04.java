package day04;

import java.util.Scanner;

public class Day04Scanner04 {

    //Get First name and last name from user then print them in upper cases on the console with a space between them

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first name:");

        String name = input.next();

        System.out.println("Enter your second name:");

        String surname = input.next();

        System.out.println(name.toUpperCase() +" "+ surname.toUpperCase());



    }



}
