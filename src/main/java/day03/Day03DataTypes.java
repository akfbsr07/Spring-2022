package day03;

public class Day03DataTypes {

    /*
          Type Casting: Converting a number primitive data type to an another number primitive data type.

          byte - short - int - long - float - double

          Note: If you convert small data type to large data type, it is called "Auto Widening"
          Note: If you convert large data type to small data type, it is called "Explicit Narrowing"

          Wrapper Class: Wrapper Classes are classes for primitive number data types
                 byte --> Byte
                 short --> Short
             **  int --> Integer
                 long --> Long
                 float --> Float
                 double --> Double
             **  char --> Character
                 boolean --> Boolean

           Memory Usage in Java
              There are 2 types of memories in Java
               i)1)Stack Memory ==> Small
                 2)Heap Memory ==> Huge
              ii)"Primitive" data is stored in "Stack" Memory
                 "Non-Primitive" data is stored in "Heap" Memory
             iii)Java puts the reference(adress) of "non-primitive" data into the "Stack" Memory

     */

    public static void main(String[] args) {

        //Auto Widening

        byte age = 12;
        int myAge = age;

        short populationOfVillage = 21000;
        double myPopulationOfVillage = populationOfVillage;

        //Explicit Narrowing

        double x = 23.45;
        long y = (long)x;

        String name = "Mark Twain";

        System.out.println(name.toUpperCase()); //MARK TWAIN
        System.out.println(name.toLowerCase()); //mark twain

        //Find the number of characters in name String variable

        System.out.println(name.length()-1); //9

        Byte yourAge = 13;
        Boolean isOld= true;

        //If a method is static, you can acces to the method by using class name
        //If you acces a method by using class name, then the method is called "static method"
        //If you acces a method by using variable, then the method is called "non-static method"

        System.out.println(Byte.MIN_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Float.MIN_VALUE);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        //Auto Boxing has done by Java automatically
        int a = 12;
        Integer b = a; //when you need methods. It is use more memory

        //Unboxing has done by Java automatically
        int c = b;




    }

}
