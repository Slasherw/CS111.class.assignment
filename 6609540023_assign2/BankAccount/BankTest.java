package BankAccount;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        
        System.out.println("Hello User, Press 1-5 to use our bank service. (Q to Exit the Program)");
        System.out.println("1 - Create new account.");
        System.out.println("2 - Print data of all user.");
        System.out.println("3 - Find the account with balance greater than or equal to the amount specified by the user.");
        System.out.println("4 - Add Interest.");
        System.out.println("5 - Print the total balance from all accounts.");
        char choice = input.next().charAt(0);


    }
}
    
