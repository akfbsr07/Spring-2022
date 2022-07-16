package day15;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

    public static void main(String[] args) {

        int mda[][] = new int[3][2];
        System.out.println(Arrays.deepToString(mda));//[ [0, 0], [0, 0], [0, 0] ]

        mda[1][1] = 11;
        mda[2][0] = -7;
        mda[0][0] = 12;
        mda[2][1] = 16;
        mda[0][1] = -3;
        mda[1][0] = 5;
        System.out.println(Arrays.deepToString(mda));//[ [12, -3], [5, 11], [-7, 16] ]

        //Example 1: Find the sum of the first and the last inner array elements
        int sum = 0;
        for(int i=0; i<mda.length; i++){
            if(i==0 || i==mda.length-1){
                for(int k=0; k<mda[i].length; k++){
                    sum = sum + mda[i][k];
                }
            }
        }
        System.out.println(sum);//18

        //Example 2: Type code to find the total number of elements in the multidimensional array
        //           [ [5, 2], [11, 13, 15], [6], [-2, 3, 5, 12] ]
        int arr[][] = { {5, 2}, {11, 13, 15}, {6}, {-2, 3, 5, 12} };
        int totalNumOfEl = 0;
        for(int[] w : arr){
            totalNumOfEl = totalNumOfEl + w.length;
        }
        System.out.println(totalNumOfEl);

        //Example 3: Print the elements which has "a" in it from a multidimensional array
        String brr[][] = { {"Java", "is"}, {"easy", "to", "learn"}, {"if", "you", "study", "hard"} };

        for(String[] w : brr){
            for(String u : w){
                if(u.contains("a")){
                    System.out.print(u + " ");
                }
            }
        }

        System.out.println();

        //Example 4: Convert two-dimensional array to one-dimensional array
        String crr[][] = { {"Java", "is"}, {"easy", "to", "learn"}, {"if", "you", "study",  "hard", "Alex" }};

        int numOfEl = 0;
        for(String[] w : crr){
            numOfEl = numOfEl + w.length;

        }

        String drr[] = new String[numOfEl];// [null, null, null, null, null, null, null, null, null ]
        int idx = 0;

        for(String[] w : crr){
            for(String u : w){
                drr[idx] = u;
                idx++;
            }
        }
        System.out.println(Arrays.toString(drr));//["Java", "is", "easy", "to", "learn", "if", "you", "study", "hard" ]

        //Example 5: Find the sum of the max and min element in an integer multidimensional array
        int err[][] = { {5, 2}, {11, 130, 15}, {6}, {-2, 3, 5, 12} };

        //Find the maximum value
        //1.Way:
        int max = err[0][0];
        for(int[] w : err){
            for(int u : w){
                if(max<u){
                    max = u;
                }
            }
        }
        System.out.println(max);//15

        //2.Way:
        int maxx = err[0][0]; //{ {5, 2}, {11, 130, 15}, {6}, {-2, 3, 5, 12} }
        for(int[] w : err){
            for(int u : w){
                maxx = Math.max(maxx, u);
            }
        }
        System.out.println(maxx);//15

        //Find the minimum value
        int min = err[0][0];
        for(int[] w : err){
            for(int u : w){
                min = Math.min(min, u);
            }
        }
        System.out.println(min);
        System.out.println(max + min);
    }
}


