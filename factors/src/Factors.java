public class Factors {

    public static void main(String[] args) {
         long N = Long.parseLong(args[0]);
         long n = N;
         for (long i = 2; i <= n/i; i++) {
             System.out.print("i: " + i + " ");
             System.out.println("n: " + n);
             while (n % i == 0) {
                 n = n/i;  // can shortened to n /= i;
                 System.out.print("i: " + i + " ");
                 System.out.println("n: " + n);
             }
         }
         if (n > 1) System.out.println("n = " + n);
         System.out.println();
    }
}
