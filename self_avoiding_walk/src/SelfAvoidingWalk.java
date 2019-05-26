public class SelfAvoidingWalk {

    public static void main (String[] args) {
        int N = Integer.parseInt(args[0]);  // size of lattice
        int T = Integer.parseInt(args[1]);  // number of trials
        int deadEnds = 0;

        for (int t = 0; t <= T; t++) {
            boolean[][] a = new boolean[N][N];   // initializes array, all entries are false by default
            int x = N / 2;  // start position of walk
            int y = N / 2;

            while (x > 0 && y > 0 && x < N-1 && y < N-1) { // make sure entries are not out of array bounds
                a[x][y] = true;
                if (a[x - 1][y] && a[x + 1][y] && a[x][y - 1] && a[x][y + 1]) {
                    deadEnds++;
                    break;
                }
                double r = Math.random();

                if (r < 0.25) {
                    if (!a[x - 1][y]) {
                        x--;
                    }
                } else if (r < 0.50) {
                    if (!a[x + 1][y]) {
                        x++;
                    }
                } else if (r < 0.75) {
                    if (!a[x][y - 1]) {
                        y--;
                    }
                } else if (r < 1.00) {
                    if (!a[x][y + 1]) {
                        y++;
                    }
                }
            }
        }
        System.out.println(100*deadEnds/T + "% dead ends");
    }
}
