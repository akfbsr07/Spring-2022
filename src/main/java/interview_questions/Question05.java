package interview_questions;

public class Question05 {

    //Reverse the String "Learn Java"

    public static void main(String[] args) {

        String str = "Learn Java";
        String reversed = "";
        char ch;
        for (int i = str.length()-1 ; i > -1; i--) {

            ch = str.charAt(i);
            reversed = reversed + ch;

        }

        System.out.println(reversed);


    //Reverse the String "Tom Hanks"

        String name = "Tom Hanks";
        String reversedName = "";
        char characters;

        for (int k = name.length()-1 ; k > -1 ; k--) {
            characters = name.charAt(k);
            reversedName = reversedName + characters;
        }

        System.out.println(reversedName);


    //Reverse the String "I am Spider-Man" with String Builder

    StringBuilder hero = new StringBuilder("I am Spider-Man");
        System.out.println(hero.reverse());


    }

}
