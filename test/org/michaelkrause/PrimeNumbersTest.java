package org.michaelkrause;

import org.junit.Test;
import java.util.InputMismatchException;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PrimeNumbersTest {

    @Test
    public void testPrimeNumber_true() {
        boolean pred = PrimeNumbers.isPrime(3);
        assertTrue(pred);
    }

    @Test
    public void testPrimeNumber_false() {
        boolean pred = PrimeNumbers.isPrime(4);
        assertFalse(pred);
    }

    @Test(expected = InputMismatchException.class)
    public void testPrimeNumber_wrong_input() {
        PrimeNumbers.isPrime(-3);
    }

}
