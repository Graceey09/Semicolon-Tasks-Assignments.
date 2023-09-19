//package tdd;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class BankTest {
//    @Test
//    public void bankRegisterCustomersTest(){
//      Bank bankApp = new Bank("Stanbic");
//      bankApp.registerAccount("Grace", "Maduekwe", "1234");
//
//}
//    @Test
//    public void bankCanFindAccountTest(){
//        Bank bankApp = new Bank("Stanbic");
//        bankApp.registerAccount("Grace", "Maduekwe", "1234");
//        bankApp.findAccount("1");
//        assertEquals("Grace Maduekwe", bankApp.findAccount("1").getAccountName());
//    }
//    @Test
//    public void moneyCanBeDepositedTest(){
//        Bank bankApp = new Bank("Stanbic");
//        bankApp.registerAccount("Grace", "Maduekwe", "1234");
//        bankApp.findAccount("1");
//        assertEquals(0, bankApp.checkBalance("1234"));
//        bankApp.deposit(10_000, bankApp.checkBalance("1234"));
//    }
//    @Test
//    public void moneCanBeWithdrawnTest(){
//        Bank bankApp = new Bank("Stanbic");
//        bankApp.registerAccount("Grace", "Maduekwe", "1234");
//        bankApp.findAccount("1");
//        assertEquals(0, bankApp.checkBalance("1234"));
//        bankApp.deposit(10_000, bankApp.checkBalance("1234"));
//        bankApp.withdraw(5_000, "1", "1234");
//    }
//}
