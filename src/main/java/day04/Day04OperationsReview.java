package day04;

public class Day04OperationsReview {

    public static void main(String[] args) {

        // +, -, *, /
        //Increment and Decrement operations
        //Comparison Operators
        //Logical Operators, AND Operator, OR Operator
        //post-increment and pre-increment

        int a = 3;
        int b = 4;
        int c = 5;

        int sum = a + b + c; //12
        System.out.println(sum);
        int subtract = a - c - b; //-6
        System.out.println(subtract);
        int multiply = a*b*c; //60;
        System.out.println(multiply);
        double div = 4/4;
        System.out.println(div);
        boolean q = 12==12; //true
        System.out.println(q);
        boolean w = 13!=34; //true
        System.out.println(w);
        boolean e = 12<11; //false
        System.out.println(e);
        boolean r = 27>=28; //false
        System.out.println(r);

        boolean t = 12<34 || 12>3; //true
        System.out.println(t);
        boolean y = 3<5 || 7>9; //true
        System.out.println(y);
        boolean u = 45>12 && 3<5; //true
        System.out.println(u);
        boolean i = 12<44 && 3>5; //false
        System.out.println(i);

        int d = 12;  //12
        System.out.println(d);
        int o = ++d; //13
        System.out.println(d);//13
        System.out.println(o);

        int v = 23;  //23
        System.out.println(v);
        int m = v++; //23
        System.out.println(v); //24
        System.out.println(m);


    }

}
