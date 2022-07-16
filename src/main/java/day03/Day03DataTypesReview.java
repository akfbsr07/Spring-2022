package day03;

public class Day03DataTypesReview {

    public static void main(String[] args) {

        //Auto Widening

        short age = 25;
        int myAge = age;

        //Explicit Narrowing

        int popOfTurkey = 80000000;
        byte peopleOfTurkey = (byte)popOfTurkey ;

        //Find the number of characters in name String variable

        String favDirector = "Quentin Tarantino";
        String onlyChar = favDirector.replaceAll(" ", "");
        System.out.println(onlyChar.length());

        //Auto Boxing has done by Java automatically

        int a = 123;
        Integer b = a;

        //Unboxing has done by Java automatically

        Byte c = 127;
        byte d = c;

        //Turn all characters upper and lower cases

        String favActress = "Uma Thurman";
        System.out.println(favActress.toLowerCase());
        System.out.println(favActress.toUpperCase());
        int length = (favActress.length()-1);
        System.out.println(length);

    }

}
