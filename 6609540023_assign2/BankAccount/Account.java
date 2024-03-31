package BankAccount;

public class Account {
    private double balance;
    private int accountNumber;
    private static int lastAccountNumber = 0 ;
    public Account(double intialBalance){
        balance = intialBalance;
        accountNumber = lastAccountNumber + 1;
        lastAccountNumber = accountNumber;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double depositAmount){
        balance += depositAmount;
    }

    public boolean withdraw(double withdrawAmount){
        if(withdrawAmount > balance){
            System.out.println("Insufficient Funds!!!");
            return false;
        } else {
            balance -= withdrawAmount;
            return true;
        }
    }
}
