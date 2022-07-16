package day20;

/*
   Polymorphism(something in multiple forms) = Overloading + Overriding

   1)We need methods with "same name" and "different parameters" to make our codes more readable,
   This is called "method overloading"

   2)How can we make parameters different
     i)By changing the number of the parameters
     ii)By changing the data types of parameters
     iii)By changing the order of the parameters if the data types are different

   3)Can you overload private methods?
      Method Overloading is done in a single class, "private" access modifier creates issue if you are
      outside the class. Therefore, doing method overloading will not be problem for private methods.

   4)Can you overload static methods?
      "static" methods can be overloaded

   5)Method Overloading is a part of "Polymorphism" because we create a method in multiple forms

 */

public class Overloading01 {

    public static void main(String[] args) {

        System.out.println(add(7,13));
        System.out.println(add(3,5,7,10));
        System.out.println(add(7.7,3.3));
        System.out.println(add("Tom", "Hanks"));
        System.out.println(add("Akif",7));
        System.out.println(add(7,"James Bond"));

    }

    public static int add(int a, int b){
        return a + b ;
    }

    public static int add(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static double add(double a, double b){
        return a + b ;
    }

    public static String add(String a, String b){
        return a + b ;
    }

    public static String add(String a, int b){
        return a + b ;
    }

    public static String add(int a, String b){
        return a + b ;
    }

}
