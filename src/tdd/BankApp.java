package tdd;

import java.util.ArrayList;
import java.util.List;

public class BankApp {
    private List<Account> accounts = new ArrayList<>();
    private String name;
    private int numberOfCustomers;

    public BankApp(String bankName, int countAccounts) {
        name = bankName;
    }

    public void registerAccount(String firstName, String lastName, String pin) {
    }

    public void findAccount(){

    }

    public int getAccounts() {
        return 0;
    }
}
