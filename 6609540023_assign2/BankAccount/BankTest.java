//นพกรณ์ สงเคราะห์
//6609540023
package BankAccount;

import java.util.Scanner;

public class BankTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        Bank commandBank = new Bank();
        
        System.out.println("Hello User, Press 1-5 to use our bank service. (Q to Exit the Program)");
        while (loop) {
            System.out.println("1 - Create new account.");
            System.out.println("2 - Print user account information.");
            System.out.println("3 - Find the account with balance greater than or equal to the amount specified by the user.");
            System.out.println("4 - Add Interest.");
            System.out.println("5 - Print the total balance from all accounts.");
            char choice = input.next().charAt(0);
 
            switch (choice) {
                case 1:
                    double balance = input.nextDouble();
                    Account userAccount = new Account(balance);
                    commandBank.addAccount(userAccount);
                    break;

                case 2:
                    System.out.print("Please enter account number:");
                    int index = input.nextInt();
                    System.out.println("Account number: "+commandBank.getAccount(index).getAccountNumber());
                    System.out.println("Account balance: "+commandBank.getAccount(index).getBalance());
                    break;

                case 3:
                    System.out.print("Please enter the amount:");
                    double amount = input.nextDouble();
                    for (Account account : commandBank.findAccounts(amount)) {
                        System.out.println("Account number: "+account.getAccountNumber());
                        System.out.println("Account balance: "+account.getBalance());
                    }
                    System.out.println("Account that has least amount:");
                    System.out.println("\tAccount number"+commandBank.findMin().getAccountNumber());
                    System.out.println("\tAccount balance"+commandBank.findMin().getBalance());
                    System.out.println("Account that has most amount:");
                    System.out.println("\tAccount number"+commandBank.findMax().getAccountNumber());
                    System.out.println("\tAccount balance"+commandBank.findMax().getBalance());
                    break;

                case 4:
                    commandBank.addInterest();
                    for (Account account : commandBank.getAccountList()) {
                        System.out.println("Account "+account.getAccountNumber()+" : "+account.getBalance());  
                    }
                    break;

                case 5:
                    System.out.println("The total balance from all accounts is "+commandBank.getTotal());
                    System.out.println("The average balance from all accounts is "+commandBank.getAverage());
                    break;
                
                case 'Q':
                    loop=false;
                    break;

                default:
                    break;
            }
        }
        input.close();
    }
}
    
