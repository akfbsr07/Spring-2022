package interview_questions;

public class Question28 {

    //Write a code to do discount by status

    public static void main(String[] args) {
      int shirtPrice = 100;

        System.out.println(doDiscount("veterans", shirtPrice));
        System.out.println(doDiscount("students", shirtPrice));
        System.out.println(doDiscount("seniors", shirtPrice));

        System.out.println(addExclamation("Hello"));
        System.out.println(addExclamation("Hej"));
        System.out.println(addExclamation("Welcome"));
    }
    public static int doDiscount(String status, int price){
        switch (status){

            case "veterans":
                price = price - 20;
                break;
            case "students":
                price = price-10;
                break;
            case "seniors":
                price = price-5;
                break;
            default:
                price=price;

        } return price;
    }

    public static String addExclamation(String greetings){
        return greetings + "!";
    }

}
