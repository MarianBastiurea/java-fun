package org.example.c20debugging;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTestParameterized {

    @ParameterizedTest
    @CsvSource({
            "100.00, true, 1100.00",
            "200.00, true, 1200.00",
            "325.14, true, 1325.14",
            "489.33, true, 1489.33",
            "1000.00, true, 2000.00"
    })
    public void testDeposit(double depositAmount, boolean branch, double expectedBalance) {
        BankAccount bankAccount = new BankAccount("John", "Doe", 1000, BankAccount.CHECKING);
        bankAccount.deposit(depositAmount, branch);
        assertEquals(expectedBalance, bankAccount.getBalance(), 0.01);
    }

    @ParameterizedTest
    @CsvSource({
            "100.00, true, 900.00",
            "200.00, true, 800.00",
            "325.14, true, 674.86",
            "489.33, true, 510.67",
            "1000.00, true, 0.00"
    })
    public void testWithdraw(double withdrawAmount, boolean branch, double expectedBalance) {
        BankAccount bankAccount = new BankAccount("John", "Doe", 1000, BankAccount.CHECKING);
        bankAccount.withdraw(withdrawAmount, branch);
        assertEquals(expectedBalance, bankAccount.getBalance(), 0.01);
    }
}