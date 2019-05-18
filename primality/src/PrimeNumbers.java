import java.util.InputMismatchException;

public class PrimeNumbers {

    public static boolean isPrime(int n) {

        if (n < 1) {
            throw new InputMismatchException();
        }

        boolean flag = false;

        for (int i = 2; i <= n / 2; ++i) {
            if (n % 2 == 0) {
                flag = true;
                break;
            }
        }
        return !flag;  //
    }
}