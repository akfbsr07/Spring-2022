package interview_questions;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Question20 {

    public static void main(String[] args) {

        //Print the sum of the ages array elements on the console

        int arr[] = new int[5];

        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 7;
        arr[3] = 1;
        arr[4] = 9;

        System.out.println(Arrays.toString(arr));
        int sumOfElements = 0;

        for (int i = 0; i < arr.length ; i++) {
            sumOfElements = sumOfElements + arr[i];
        }
        System.out.println(sumOfElements);

        //Find the total number of characters in array elements

        String arr2[]= {"Steve", "Dustin", "Robin", "Nancy", "Eleven", "Eddie", "Max"};

        //System.out.println(arr2[0].length());
        int totalChar = 0;

        for (int i = 0; i < arr2.length; i++) {
            totalChar = totalChar + arr2[i].length();
        }
        System.out.println(totalChar);

        //Type code to print the sum of the min and max value of an integer array

        int arr3[] = {3,13,7,134,65,177,33,75,25};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        int minVal = arr3[0];
        int maxVal = arr3[arr3.length-1];
        System.out.println("Min Value: " + minVal);
        System.out.println("Max Value: " + maxVal);

        //Create a String array by getting elements from user
        //Type code to put elements in alphabetical order
        //Type code to print the total number of characters in the first and the last String

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the length of the Array please");
        int lengthOfArray = scan.nextInt();
        String arr4[] = new String[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("Enter the " + (i+1) +". element please");
            arr4[i]=scan.next();
        }
        System.out.println(Arrays.toString(arr4));
        Arrays.sort(arr4);
        System.out.println(Arrays.toString(arr4));
        int lengthOfFirstElement = arr4[0].length();
        int lengthOfLastElement = arr4[arr4.length-1].length();
        System.out.println("First length: " + lengthOfFirstElement);
        System.out.println("Last length: " + lengthOfLastElement);

        // [0, 2, 3, 0, 12, 0] put the zeros to the end ==> [2, 3, 12, 0, 0, 0]

        int arr5[]={0,2,3,0,12,0};
        int arr6[]= new int[arr5.length];
        int idx2 = 0;
        for (int i = 0; i < arr5.length; i++) {
            if(arr5[i]== 0){
               continue;
            }else{arr6[idx2]=arr5[i];};
            idx2++;

        }System.out.println(Arrays.toString(arr6));

        //Create an integer array and print all the elements less than 5
        //[12, 3, -3, 5, 23] ==> 3, -3

        int arr7[] = {12, 3, -3, 5, 23};

        for (int i = 0; i < arr7.length; i++) {
            if (arr7[i]<5){
                System.out.print(arr7[i] + " ");
            }

        }

    }

}
