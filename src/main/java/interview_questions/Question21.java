package interview_questions;

import java.util.Arrays;

public class Question21 {

    public static void main(String[] args) {

        //Example 1: Find the sum of the first and the last inner array elements [ [12, -3], [5, 11], [-7, 16] ]
        int sum = 0;

        int arr[][]= {{12, -3}, {5, 11}, {-7, 16}};
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]==arr[0] || arr[i]==arr[arr.length-1])
            {for (int j = 0; j < arr[i].length; j++){
                sum = sum + arr[i][j];}
            }
        }
        System.out.println(sum);


        //Example 2: Type code to find the total number of elements in the multidimensional array [ [5, 2], [11, 13, 15], [6], [-2, 3, 5, 12] ]

        int arr2[][]={{5,2}, {11,13,15}, {6}, {-2,3,5,12}};
        int counter = 0;

        for (int i = 0; i < arr2.length ; i++) {
            for (int j = 0; j < arr2[i].length ; j++) {
                int a = arr2[i][j];
                counter++;
            }
        }System.out.println("Number of elements in Array= " + counter);


        //Example 3: Print the elements which has "a" in it from a multidimensional array { {"Java", "is"}, {"easy", "to", "learn"}, {"if", "you", "study", "hard"} }

        String arr3[][]= { {"Java", "is"}, {"easy", "to", "learn"}, {"if", "you", "study", "hard"} };
        for (int i = 0; i < arr3.length ; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (arr3[i][j].contains("a")) {
                    System.out.print(arr3[i][j] + " ");}
                }
            }

        System.out.println();
        //Example 4: Convert two-dimensional array to one-dimensional array  { {"Java", "is"}, {"easy", "to", "learn"}, {"if", "you", "study",  "hard", "Alex" }}

        String arr4[][]= { {"Java", "is"}, {"easy", "to", "learn"}, {"if", "you", "study",  "hard", "Alex" }};
        String newArr4[]= new String[10];
        int idx = 0;

        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length ; j++) {
                newArr4[idx]=arr4[i][j];
                idx++;
            }
        }System.out.println(Arrays.toString(newArr4));

        System.out.println();
        //Example 5: Find the sum of the max and min element in an integer multidimensional array { {5, 2}, {11, 130, 15}, {6}, {-2, 3, 5, 12} }

        int arr5[][]= { {5, 2}, {11, 130, 15}, {6}, {-2, 3, 5, 12} };
        int newArr5[]= new int[10];
        int index = 0;

        for (int i = 0; i < arr5.length; i++) {
            for (int j = 0; j < arr5[i].length; j++) {
                newArr5[index] = arr5[i][j];
                index++;
            }
        } Arrays.sort(newArr5);
        int sumOfMaxAndMin = newArr5[0] + newArr5[newArr5.length-1];
        System.out.println("Sum of the maximum and minimum element is= " + sumOfMaxAndMin);
    }

}
