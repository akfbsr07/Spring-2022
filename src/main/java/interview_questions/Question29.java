package interview_questions;

public class Question29 {

    // Create a method to do multiple sum operations

    public static void main(String[] args) {

        System.out.println(add(3, 1, 2, 4, 5, 6));
        System.out.println(add(2, 4));
        System.out.println(add());
        System.out.println(add(23, 1, 3));

    }

    public static int add(int... a){
        int sum = 0;
        for (int w : a) {
          sum = sum + w;
        }
        return sum;
    }
}
