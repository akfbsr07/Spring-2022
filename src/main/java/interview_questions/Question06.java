package interview_questions;

public class Question06 {

    /*
            String shirtPrice = "$12.99";
            String bookPrice = "$35.99";
            Type code to find the sum of the shirt and book prices.
        */

    public static void main(String[] args) {

        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String s = shirtPrice.replace("$","");
        String b = bookPrice.replace("$", "");

        double sP = Double.valueOf(s);
        double bP = Double.valueOf(b);

        double sumPrice = sP + bP;
        System.out.println("Shirt price + Book price = " + sumPrice + "$");
    }

}
