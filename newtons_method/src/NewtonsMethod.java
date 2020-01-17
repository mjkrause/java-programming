public class NewtonsMethod {
/*
Find the square root of c. I put 11 as an argument into the config.
 */
    public static void main(String[] args) {

        double c = Double.parseDouble(args[0]);
        double epsilon = 1e-15;  // error tolerance
        double t = c;  // t is am estimate of c
        System.out.println("t = " + t);
        while(Math.abs(t - c/t) > epsilon * t) {
            //Replace t by the average of t and c/t.
            t = (t + c / t) / 2.0;
            System.out.println("t: " + t);
        }
        System.out.println("t: " + t);

    }
}
