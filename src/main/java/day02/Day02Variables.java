package day02;

import java.sql.SQLOutput;

public class Day02Variables {

    public static void main(String[] args) {

        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);

        //If you create a variable inside the ''main method'', Java will accept it as static

        // Create a char variable
        // Do not forget to put the char value between single quotes
        // Default value of char is the character whom value is zero which is Null
        char initial = 'A';

        //Create a boolean variable
        //Default value of boolean is false
        boolean isOld = false;
        boolean isAlive = true;

        //Create a byte variable
        byte ageOfMe = 25;

        //Create a short variable
        short popOfVillage = 27000;

        //Create a long variable
        // Do not forget to put L to the end when you create a long variable
        long popOfWorld = 8000000000L;


    }

    /*How to create a variable
    Data Type - Variable Name - Equal Sign- Value- Semi Colon
     */

    static int age = 25;

    static double height = 1.78;

    static double weight = 86.6;

    /* declaration       assignment
    if you do not write any acces modifier for a variable
    The acces modifier will be default.
     */

    /* Data Types in Java
       1)Primitive Data Types:
       i)Those data types were created by Java, we cannot create any primitive data type
       ii)Primitive data types are 8
         a)byte-short-int-long-float-double / char-boolean
           char: It is for single characters like A, h, ?, ! etc.
           boolean: İt is for true-false values

           byte: It is used for the values from -128 to 127 for whole numbers
           short: It is used for the values from -32.000 sth to 32.000 sth for whole numbers
           int: It is used for the values from -2 billion sth to 2 billion sth for whole numbers
           long: It is used for the values from -............ to ................ for whole values. (very large no need to know)

           float: It is used for decimals. Float uses less memory than double.
                  When you create float as data type you have to put 'F' or 'f' at the end.
                  Float has 7 digits at most in decimal part.

           double: It is used for decimals. It is used for scientific researches.
                   Double has 16 digits at most in decimal part.



     */

     /*2)Non-Primitive Data Types:
        i)Those data types can be created by Java and Java Developers
        String is a non-primitive data type
        String data type is used for multiple characters

        Note: What is the difference between "primitive" and "non-primitive" data types?
        Answer: There are 4 main differences;
              i)"primitive" data types start with lowercases, "non-primitive" data types start with uppercases
              ii)"primitive" data types can be created just by java not by developers, "non-primitive" data types can be created by Java and Java developers
              iii)"primitive" data types use different type of memory.But "non-primitive" data types all use same memory
              iiii)"primitive" data types just have values in it but "non-primitive" data types have values and methods in it.

      */

       String nameOfStudents = "Mark Twain";
       String studentId = "Mt2022_01";

}
