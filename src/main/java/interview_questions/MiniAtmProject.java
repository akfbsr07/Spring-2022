package interview_questions;

import java.util.Scanner;

public class MiniAtmProject {

    public static void main(String[] args) {


        System.out.println("Hello!");
        System.out.println("Select Option please: ");
        System.out.println("1) Checking Account");
        System.out.println("2) Saving Account");
        System.out.println("3) Quit");
        Scanner scan = new Scanner(System.in);
        int option = scan.nextInt();


        if (option == 1) {
            System.out.println("CHECKING ACCOUNT: ");
            System.out.println("Select Option please: ");
            System.out.println("1) View Balance");
            System.out.println("2) Withdraw");
            System.out.println("3) Deposit");
            System.out.println("4) Exit");
            int checkOption = scan.nextInt();
            switch (checkOption) {

                case 1:
                    System.out.println("VIEW BALANCE");
                    break;

                case 2:
                    System.out.println("WITHDRAW");
                    break;

                case 3:
                    System.out.println("DEPOSIT");
                    break;

                case 4:
                    System.out.println("EXIT");
                    break;
            }
        } else if (option == 2) {
            System.out.println("SAVING ACCOUNT");
            System.out.println("Select Option please: ");
            System.out.println("1) View Balance");
            System.out.println("2) Withdraw");
            System.out.println("3) Deposit");
            System.out.println("4) Exit");
            int saveOption = scan.nextInt();

            switch (saveOption) {

                case 1:
                    System.out.println("VIEW BALANCE");
                    break;

                case 2:
                    System.out.println("WITHDRAW");
                    break;

                case 3:
                    System.out.println("DEPOSIT");
                    break;

                case 4:
                    System.out.println("EXIT");
                    break;


            }

        } else if (option == 3) {
            System.out.println("EXIT");
        }

    }
}
