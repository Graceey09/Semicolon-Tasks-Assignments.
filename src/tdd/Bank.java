package tdd;

import JavaWorks.CustomExceptions;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String accountNumber;
    private List<Account> accounts = new ArrayList<>();
    private String bankName;
    private int numberOfCustomers;

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accounts=" + accounts +
                ", bankName='" + bankName + '\'' +
                ", numberOfCustomers=" + numberOfCustomers +
                '}';
    }

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void registerAccount(String firstName, String lastName, String pin) {
        String accountName = firstName + " " + lastName;
        Account newAccount = new Account(accountName,generateAccountNumber(), pin);
        accounts.add(newAccount);
    }

    public Account findAccount(String accountNumber){
        for (Account account: accounts){
            if (account.getAccountNumber().equals(accountNumber)){
                return account;
            }
        }
        throw new IllegalArgumentException("GitHubCodes.Account not found");
    }
    private String generateAccountNumber(){return (accounts.size()  + 1) + "";}

    public void deposit(int amount, String accountNumber){findAccount(accountNumber).deposit(amount);}
    public void withdraw(int amount, String number, String pin){findAccount(number).withdraw(amount, pin);}

    public double checkBalance(String accountNumber, String pin) {
        return findAccount(accountNumber).getBalance();
    }
    public void transfer(String senderAccount, String receiverAccount, int amount, String pin) throws CustomExceptions {
        findAccount(senderAccount).withdraw(amount, pin);
        findAccount(receiverAccount).deposit(amount);
    }
}
