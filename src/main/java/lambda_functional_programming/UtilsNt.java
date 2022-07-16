package lambda_functional_programming;

public class UtilsNt {

    public static void printTheSameLineWithSpace(Object i){
        System.out.print(i + " ");
    }

    public static boolean checkToBeEven(int x){
        return x%2==0;
    }

    public static boolean checkToBeOdd(int x){
        return x%2!=0;
    }

    public static int getSquare(int x){
        return x*x;
    }

    public static int getCube(int x){
        return x*x*x;
    }

    public static double calculateHalf(double x){
        return x/2.0;
    }

    public static char getLastChar(String str){
        return str.charAt(str.length()-1);
    }

    public static char getFirstChar(String str){
        return str.charAt(0);
    }

    public static int getSumOfDigits(int x){
        int sum = 0;
        while (x!=0){
            sum += x%10;
            x = x/10;
        }
       return sum;
    }

}
