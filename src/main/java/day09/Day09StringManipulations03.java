package day09;

public class Day09StringManipulations03 {

    public static void main(String[] args) {

         /*
            String shirtPrice = "$12.99";
            String bookPrice = "$35.99";
            Type code to find the sum of the shirt and book prices.
        */
        String shirtPrice = "$12.99";
        String bookPrice = "$35.99";

        String s = shirtPrice.replace("$", "");
        System.out.println(s);// 12.99

        String b = bookPrice.replace("$", "");
        System.out.println(b);// 35.99

        double sd = Double.valueOf(s);

        double bd = Double.valueOf(b);

        System.out.println("$" + (sd + bd));//46.98

    }
}
