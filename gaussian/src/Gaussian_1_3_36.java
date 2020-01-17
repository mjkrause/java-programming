public class Gaussian_1_3_36 {


    public static int factorial(int n) {
        // Find factorial of n.
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }

    public static void main (String[] args) {
        // Approximate exp(x) using implementation of a Taylor series for exp(x).

        int phi = Integer.parseInt(args[0]);
        double term = 0.0;
        double sum = 1.0;
        int nIter = 20;
        double numerator = 1.0;
        double denominator = 1.0;

        for (int i = 1; i <= nIter; i++) {

            System.out.println("iteration: " + i);
            numerator = numerator * phi;
            System.out.println("numerator: " + numerator);
            denominator = i * denominator;
            System.out.println("denominator: " + denominator);
            term = numerator/denominator;
            System.out.println("term: " + term);
            System.out.println("sum :" + sum);
            System.out.println(" ");
            sum = sum + term;

        }
        System.out.println("exp(" + phi + ") is approximately " + sum + " after " + nIter + " iterations.");

        double expected = Math.exp(phi);
        System.out.println("exp(" + phi + ") computed using Math.exp is " + expected);
        System.out.println("epsilon: " + Math.abs(expected-sum));
    }
}
