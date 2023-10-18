package tdd;

import javax.swing.*;
import java.util.Scanner;

public class ATMachine {

    private static Bank bank = new Bank("Globus Bank");

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        displayMethod("""
                1.Register
                2.Deposit
                3.Withdraw
                4.Balance
                5.Transfer""");
        String option = inputMethod("Enter option: ");
        if (option.equalsIgnoreCase("1"))
            register();
        else if (option.equals("2")) deposit();

        else if (option.equals("3")) withdraw();

        else if (option.equals("4")) checkBalance();

        else if (option.equals("5")) transfer();

        else {
            throw  new IllegalArgumentException("invalid entry, Please select valid option (1-5).");
        }


    }



    private static void transfer() {
        try{
            String senderAccount = inputMethod("Enter sender account");
            String receiverAccount = inputMethod("Enter receiver account");
            String amount = inputMethod("Enter amount to be sent");
            String pin = inputMethod("Enter your pin");
            bank.transfer(senderAccount, receiverAccount, Integer.parseInt(amount), pin);
        }catch (IllegalArgumentException Error){
            displayMethod(Error.getMessage());
        }
    }




    private static void register(){
        try{
            String firstName = inputMethod("Enter first name: ");
            String lastName = inputMethod("Enter last name: ");
            String pin = inputMethod("Enter pin: ");
            bank.registerAccount(firstName, lastName, pin) ;
        }catch (IllegalArgumentException Error){
            displayMethod(Error.getMessage());
        }
        menu();
    }
    private static void deposit(){
        try{
            String accountNumber = inputMethod("Enter your account number: ");
            String amount = inputMethod("Enter amount: ");
            bank.deposit(Integer.parseInt(amount), accountNumber);
        }catch (IllegalArgumentException Error){
            displayMethod(Error.getMessage());
        }
    }
    private static void withdraw() {
        try {
            String amount = inputMethod("Enter amount: ");
            String number = inputMethod("Enter number: ");
            String pin = inputMethod("Enter your pin: ");
            bank.withdraw(Integer.parseInt(amount), number, pin);
        }catch (IllegalArgumentException Error){
            displayMethod(Error.getMessage());
        }
    }



    private static void checkBalance(){
        try{
            String accountNumber = inputMethod("Enter account number: ");
            String pin = inputMethod("Enter your pin: ");
            bank.checkBalance(accountNumber, pin);

        }catch (IllegalArgumentException Error){
            displayMethod(Error.getMessage());
        }
    }
    private static String inputMethod(String prompt){return JOptionPane.showInputDialog(null, prompt);
    }

    private static void displayMethod(String prompt) {JOptionPane.showInputDialog(null,prompt);
    }
}
