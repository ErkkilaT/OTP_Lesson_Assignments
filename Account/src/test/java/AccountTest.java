import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account acc;
    @BeforeEach
    void setUp() {
        acc = new Account();
    }

    @Test
    void deposit() {
        acc.deposit(100);
        assertEquals(100, acc.getBalance(), 0.1);
        acc.deposit(200);
        assertEquals(300, acc.getBalance(), 0.1);
    }

    @Test
    void withdraw() {
        assertEquals(0, acc.withdraw(100), 0.1);
        acc.deposit(200);
        assertEquals(10, acc.withdraw(10), 0.1);
        assertEquals(190, acc.withdraw(190), 0.1);
        assertEquals(0, acc.getBalance(), 0.1);
    }

    @Test
    void getBalance() {
        assertEquals(0, acc.getBalance(), 0.1);
        acc.deposit(200);
        assertEquals(200, acc.getBalance(), 0.1);
        acc.withdraw(50);
        assertEquals(150, acc.getBalance(), 0.1);
    }
}