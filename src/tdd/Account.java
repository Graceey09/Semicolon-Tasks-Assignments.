package tdd;

import java.util.Objects;

public class Account {
    private String pin;
    private int balance;
    private String accountName;
    public Account(String accountName, String accountNumber, String pin) {
        this.pin = pin;
    }

    public void deposit(int  amount) {
        balance = balance + amount;
    }

    public int checkBalance(String pin){
        validatePin(pin);
        return  balance;
    }
    private void validatePin(String pin){
        if (!this.pin.equals(pin)) throw new IllegalArgumentException("wrong pin");
    }

    public void withdraw(int amount, String pin) {
        validateWithdrawal(amount);
        validatePin(pin);
        balance = balance - amount;
    }
    public void validateWithdrawal(int amount){
        if (amount > balance ){
            throw new IllegalArgumentException("Insufficient balance");
            }
        else if ( amount < 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        }

    public String getAccountName() {
        return accountName;
    }

    public void getAccountNumber(String accountNumber) {
    }
}
