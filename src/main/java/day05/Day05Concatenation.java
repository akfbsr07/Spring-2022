package day05;

public class Day05Concatenation {
/*
       Concatenation: Joining Strings with each other or with other data types
                      To do concat. we have 2 options;
                      1)Use '+' sign ==> Can be used with all data types
                      2)Use 'concat()' method ==> Can be used with only String
 */
    public static void main(String[] args) {

    String s = "Tom";
    String t = "Hanks";
    int i = 12;
    int k = 5;
    char c = 'A';

        System.out.println(s.concat(" ").concat(t));

    System.out.println(s + " " + t);
    System.out.println(s + i + k);
    System.out.println(s + (i+k));
    System.out.println(i + k + s);
    System.out.println(i + s + k);
    System.out.println(s + k * i);
    System.out.println(i + c + s);
    System.out.println(c + s + k);

    }

}
