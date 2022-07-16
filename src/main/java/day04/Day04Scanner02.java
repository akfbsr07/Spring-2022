package day04;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Day04Scanner02 {

    /*
        Ask user to enter the width and length of a rectangle then print the area and perimeter on the consoler

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the width of the rectangle");

        double width = input.nextDouble();

        System.out.println("Enter the lenght of the rectangle");

        double lenght = input.nextDouble();

        System.out.println("Area is " + width*lenght);

        System.out.println("Perimeter is " + 2*(width+lenght));



    }


}
