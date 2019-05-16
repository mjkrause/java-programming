package org.michaelkrause;

import java.util.InputMismatchException;

public class PrimeNumbers {

    public static boolean isPrime(int n) {

        if (n < 1) {
            throw new InputMismatchException();
        }

        for (int i = 2; i <= n / 2; ++i) {
            if (n % 2 == 0) {
                return false;
            }
        }
        return true;
    }
}
