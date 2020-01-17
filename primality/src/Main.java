import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner PrimeObj = new Scanner(System.in);
        System.out.println("Enter number: ");

        String num = PrimeObj.nextLine();
        System.out.println("Testing whether number " + num + " is prime");

        int n = Integer.parseInt(num);

        boolean pred = PrimeNumbers.isPrime(n);
        if (pred == true) {
            System.out.println(n + " " + "is prime");
        } else {
            System.out.println(n + " " + "is not prime");
        }
    }
}
