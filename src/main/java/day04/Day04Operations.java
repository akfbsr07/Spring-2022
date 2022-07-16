package day04;

public class Day04Operations {

    /*
        Operations in Java
        1) +, -, *, /
           Order of operations: i)Operations inside the parenthesis
                               ii)Multiplications and divisions
                              iii)Additions and subtractions

        2)Increment and Decrement operations
            Increment ==> addition and multiplication
            Decrement ==> subtraction and division

        3)Comparison Operators
            >, <, >=, <=, ==, !=
             Note: In Mathematics, singel equal sign '=' means equality but in Java '==' means equality
             Note: In Java, '!' means 'not' so '!=' means 'not equal'
             Note: All 'Comparison Operators' return boolean

        4)Logical Operators
          i)AND Operator: && ==> This operator is use between two boolean values
            true && true ==> true
            true && false ==> false
            false && true ==> false
            false && false ==> false

         ii) OR Operator: || ==> This operator is use between two boolean values
             true || true ==> true
             true || false ==> true
             false || true ==> true
             false || false ==> false
     */

    public static void main(String[] args) {

       int result= 10 - 6/(2 + 5/5) + 7;
       System.out.println(result);

       int a = 12;
       //a = a + 3;
       a+=3;
       System.out.println(a);

       int b = 4;
       //b= b*3;
       b*=3;
       System.out.println(b);

       int c = 18;
       c-=3;
       System.out.println(c);

       int d = 24;
       d/=6;
       System.out.println(d);

       //Increment and Decrement by 1
        int e = 12;
        // e = e + 1;
        // e+=1;
        e++;
        System.out.println(e);

        int f = 13;
        // f = f-1;
        // f-=1;
        f--;
        System.out.println(f);

        //Comparison Operators
        int h= 12;
        int i= 13;
        System.out.println(h<i); //true
        System.out.println(h==i);//false
        System.out.println(h<=i);//true
        System.out.println(h!=i);//true

        //Logical Operator
        System.out.println(3<4 && 5>1); //true
        System.out.println(3>4 && 5>1); //false

        System.out.println(3<4 || 5>1); // true
        System.out.println(3>4 || 5>1); // true
        System.out.println(2<1 || 1>5); // false

        //post-increment and pre-increment

        //post-increment
        int x = 12;
        int y = x++;
        System.out.println(y); //12
        System.out.println(x); //13

        //pre-increment
        int m = 12;
        int n = ++m;
        System.out.println(n); //13
        System.out.println(m); //13





    }

}


