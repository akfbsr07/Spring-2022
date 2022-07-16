package interview_questions;

import java.util.Arrays;
import java.util.Scanner;

public class Question17 {

    public static void main(String[] args) {

        //Create an array by taking number of elements from the user
        //Then take the elements one by one from user and assign to the array

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of the elements");
        int lengthOfArray = scan.nextInt();

        int arr[]= new int[lengthOfArray];

        for (int i = 0; i < lengthOfArray; i++) {
            System.out.println("Enter the " + (i+1)+ ". element for the Array ");
            arr[i]=scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

       int arr2[][]={{1,3},{4,6},{7,9}};
        System.out.println(Arrays.deepToString(arr2));

        int newArr[]={3,5,7,9,};
        int newArr2[] = new int[7];
        newArr = newArr2;
        System.out.println(Arrays.toString(newArr));
        int newArr3[]={1,2,3,4,5,6,7,8,9,0};
        newArr=newArr3;
        System.out.println(Arrays.toString(newArr));
    }

}
