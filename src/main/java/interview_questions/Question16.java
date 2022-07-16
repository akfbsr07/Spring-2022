package interview_questions;

public class Question16 {

    public static void main(String[] args) {

        //Find the sum of elements of the given Array

        int arr[][] = {{3,5,7,9},{16,32}};

        int sumOfElements = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length ; j++) {
                 sumOfElements+= arr[i][j];
             }
        }
        System.out.println(sumOfElements);

    }

}
