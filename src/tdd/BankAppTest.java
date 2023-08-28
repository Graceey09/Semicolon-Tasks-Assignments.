package tdd;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAppTest {
    @Before
    BankApp stanbic = new BankApp("StanbicBank", 5);
    @Test
    public void bankAccountCanBeCreatedTest(){
        stanbic.registerAccount("Grace", "Maduekwe", "0123");
        stanbic.registerAccount("Ashley", "Ndabai", "6754");
        stanbic.registerAccount("Seyi", "Banwo", "6983");
        assertEquals(3, stanbic.countAccounts());
    }
}
