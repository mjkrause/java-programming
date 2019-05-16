package org.michaelkrause;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner PrimeObj = new Scanner(System.in);
        System.out.println("Enter number: ");

        String num = PrimeObj.nextLine();
        System.out.println("Testing whether number %s is prima" + num);

        int n = Integer.parseInt(num);

        PrimeNumbers.isPrime(n);
    }
}
