//package tdd;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Bank {
//    private List<Account> accounts = new ArrayList<>();
//    private String bankName;
//    private int numberOfCustomers;
//
//    public Bank(String bankName) {
//        bankName = bankName;
//    }
//
//    public void registerAccount(String firstName, String lastName, String pin) {
//        String accountName = firstName + " " + lastName;
//        Account newAccount = new Account(generateAccountNumber(), accountName, pin);
//        accounts.add(newAccount);
//    }
//
//    public Account findAccount(String accountNumber){
//        for (Account account: accounts){
//            if (account.getAccountNumber(accountNumber).equals(accountNumber))return account;
//        }
//        throw new IllegalArgumentException("Account not found");
//    }
//    private String generateAccountNumber(){return accounts.size() + " " + 1 + " ";}
//    public String checkBalance(String number){return findAccount(number).checkBalance(number);}
//    public void deposit(int amount, String accountNumber){findAccount(accountNumber).deposit(amount);}
//    public void withdraw(int amount, String number, String pin){findAccount(number).withdraw(amount, pin);}
//}