package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {
    @Test
    public void bankRegisterCustomersTest(){
      Bank bankApp = new Bank("Stanbic","1");
      bankApp.registerAccount("Grace", "Maduekwe", "1234");

}
    @Test
    public void bankCanFindAccountTest(){
        Bank bankApp = new Bank("Stanbic","1");
        bankApp.registerAccount("Grace", "Maduekwe", "1234");
        bankApp.findAccount("1");
        assertEquals("Grace Maduekwe", bankApp.findAccount("1").getAccountName());
    }
    @Test
    public void moneyCanBeDepositedTest(){
        Bank bankApp = new Bank("Stanbic","1");
        bankApp.registerAccount("Grace", "Maduekwe", "1234");
        assertEquals(new Account("Grace Maduekwe","1","1234").getAccount(),bankApp.findAccount("1").getAccount());
        bankApp.deposit(10_000,"1");
        assertEquals(10_000,bankApp.checkBalance("1","1234"));
    }
    @Test
    public void moneyCanBeWithdrawnTest(){
        Bank bankApp = new Bank("Stanbic","1");
        bankApp.registerAccount("Grace", "Maduekwe", "1234");
        bankApp.findAccount("1");
        assertEquals(0, bankApp.checkBalance("1", "1234"));
        bankApp.deposit(10_000, "1");
        assertEquals(10_000, bankApp.checkBalance("1", "1234"));
        bankApp.withdraw(5_000, "1", "1234");
        assertEquals(5_000, bankApp.checkBalance("1", "1234"));
    }
}
