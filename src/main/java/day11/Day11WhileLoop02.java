package day11;

public class Day11WhileLoop02 {

    public static void main(String[] args) {

        //Type code to check if a given integer is palindrome or not
        //Palindrome: 121 <==> 121        123321 <==> 123321

        int i = 1213493121;
        String iS = String.valueOf(i);

        int k = iS.length()-1;
        String reversed = "";

        while(k>=0){
            reversed = reversed + iS.charAt(k);
            k--;
        }
        System.out.println(reversed);

        if(iS.equals(reversed)){
            System.out.println("This is palindrome");
        }else{
            System.out.println("This is not palindrome");
        }

    }

}
