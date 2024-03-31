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
        ArrayList<Account> findAccount = new ArrayList<Account>();
        for (Account account : accountList) {
            if(account.getBalance() >= amount) {
                findAccount.add(account);
            }
        }
        return findAccount;
    }

    public Account findMin(){
        //return null if no account found
        //else return Account that has least amount of money in accountList
        Account minAccount = accountList.get(0);
        for (int i = 1;i < accountList.size();i++) {
            if(accountList.get(i).getBalance() < minAccount.getBalance()){
               minAccount = accountList.get(i);
            }
        }
        return minAccount;
    }

    public Account findMax(){
        //return null if no account found
        //else return Account that has most amount of money in accountList
        Account maxAccount = accountList.get(0);
        for (int i = 1;i < accountList.size();i++) {
            if(accountList.get(i).getBalance() > maxAccount.getBalance()){
               maxAccount = accountList.get(i);
            }
        }
        return maxAccount;
    }

    public void addInterest(){
        //increase interest 3% in each account in accountList
        for (Account account : accountList) {
            double interest = account.getBalance() * 0.03;
            account.deposit(interest);
        }
    }

    public double getTotal(){
        //find the sum of money in accountList
        double sum = 0.0;
        for (Account account : accountList) {
            sum+=account.getBalance();
        }
        return sum;
    }

    public double getAverage(){
        //find the average of money in accountList
        double sum = 0.0;
        for (Account account : accountList) {
            sum+=account.getBalance();
        }
        return sum/accountList.size();
    }
}
