package day04;

import java.util.Scanner;

public class Day04Scanner03 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Width?");

        double width = input.nextDouble();

        System.out.println("Length?");

        double lenght = input.nextDouble();

        System.out.println("Height?");

        double height = input.nextDouble();

        System.out.println("Volume is " + width*lenght*height);




    }


}
