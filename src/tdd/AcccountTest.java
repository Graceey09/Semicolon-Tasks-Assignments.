package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AcccountTest {
    @Test
    public void checkThatCanDepositTest(){
        Account account = new Account("AccountName", "AccountNumber", "1920");
        account.deposit(5_000);
        assertEquals(5_000, account.checkBalance("1920"));
    }
    @Test
    public void canWithdrawMoneyTest(){
        Account account = new Account("AccountName", "AccountNumber", "1920");
        account.deposit(5_000);
        assertEquals(5_000, account.checkBalance("1920"));
        account.withdraw(4_000, "1920");
        assertEquals(1_000, account.checkBalance("1920"));
    }

    @Test
    public void cannotWithdrawMoreThanBalanceTest(){
        Account account = new Account("AccountName", "AccountNumber", "1920");
        account.deposit(50_000);
        assertEquals(50_000, account.checkBalance("1920"));
        assertThrows(IllegalArgumentException.class,() -> {account.withdraw(100_000, "1920");});
        assertEquals(50_000,account.checkBalance("1920"));
    }
    @Test
    public void cannotWithdrawNegativeAmountTest(){
        Account account = new Account("AccountName", "AccountNumber", "1920");
        account.deposit(5_000);
        assertEquals(5_000, account.checkBalance("1920"));
//        account.withdraw(-5_000, "1920");
        assertThrows(IllegalArgumentException.class,() -> {account.withdraw(-5_000,"1920");});
        assertEquals(5_000,account.checkBalance("1920"));
    }
    @Test
    public void canCheckBalanceTest(){
        Account account = new Account("AccountName", "AccountNumber", "1920");
        account.deposit(500_000);
        assertEquals(500_000, account.checkBalance("1920"));

    }
    @Test
    public void cannotWithdrawWithWrongPinTest(){
        Account account = new Account("AccountName", "AccountNumber", "1920");
        account.deposit(500_000);
        assertEquals(500_000, account.checkBalance("1920"));
       assertThrows(IllegalArgumentException.class,() -> {account.withdraw(100_000, "1234");});
       assertEquals(500_000, account.checkBalance("1920"));

    }

}
