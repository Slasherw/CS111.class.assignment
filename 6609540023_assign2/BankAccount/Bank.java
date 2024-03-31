package BankAccount;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accountList;

    public void addAccount(Account acct){//add object to accountList
        accountList.add(acct);
    }

    public Account getAccount(int index){//return index in Account
        return accountList.get(index);
    }

    public ArrayList<Account> findAccounts(double amount){
        //return ArrayList that have money in Account >= amount 
        //if ArrayList is not found return null
        for (Account money : accountList) {
            if(amount<money.getBalance()){
                return null;
            } else return accountList;//?
        }
    }

    public Account findMin(){
        //return null if no account found
        //else return Account that has least amount of money in accountList
        
    }

    public Account findMax(){
        //return null if no account found
        //else return Account that has most amount of money in accountList
    }

    public void addInterest(){
        //increase interest 3% in each account in accountList
    }

    public double getTotal(){
        //find the sum of money in accountList
    }

    public double getAverage(){
        //find the average of money in accountList
    }
}
