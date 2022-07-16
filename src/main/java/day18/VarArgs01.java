package day18;

public class VarArgs01 {

    /*
        1)Varargs are used to handle multiple parameters in a single method
        2)Any parameter cannot be used after varargs
        3)Before varargs we can use parameters different from varargs
        4)In a method, we can use just a single varargs, it must be the last parameter everytime

     */

    public static void main(String[] args) {
        System.out.println(add());//0
        System.out.println(add(5));//5
        System.out.println(add(3, 5));//8
        System.out.println(add(3, 5, 7));//15
    }

    public static int add(int... a){

        int sum = 0;

        for(int w : a){
            sum = sum + w;
        }
        return sum;

    }

}
