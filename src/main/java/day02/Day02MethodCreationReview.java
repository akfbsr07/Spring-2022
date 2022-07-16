package day02;

public class Day02MethodCreationReview {

    public static void main(String[] args) {

        System.out.println(addInt(5,8));
        System.out.println(subtractInt(25, 12));
        System.out.println(multiplyInt(3, 5));
        System.out.println(divInt(17, 3));

    }

    //Create a dynamic addition method
    //Create a dynamic subtraction method
    //Create a dynamic multiplication method
    //Create a dynamic division method

    public static int addInt(int a, int b){
        return a+b;
    }

    public static int subtractInt(int a, int b){
        return a-b;
    }

    public static int multiplyInt(int a, int b){
        return a*b;
    }

    public static double divInt(double a, double b){
        return a/b;
    }

}
