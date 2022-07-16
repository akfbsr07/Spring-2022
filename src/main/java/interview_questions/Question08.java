package interview_questions;

public class Question08 {

    //Create a method prints greetings by using the given name

    public static void main(String[] args) {

        System.out.println(greetUser("Tom"));
        System.out.println(limitNum(12.213123123123f));


    }

    public static String greetUser(String name){
        return String.format("Hi %s welcome!!!", name);}

        //Create a method makes the decimal part has 5 digits

    public static String limitNum(float number){return String.format("The number is %.5f", number
        );}



    }



