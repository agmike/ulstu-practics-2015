package t1.j_max;

import java.util.Scanner;

public class solver {
    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
    }

    static String solve(Scanner in) {
        int offset = 1000;
        int n = in.nextInt();
        int[] xs = new int[n];
        int[] ys = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = in.nextInt();
            ys[i] = in.nextInt() + offset;
        }

        double s = 0;
        for (int i = 0; i < n; i++) {
            int a = ys[i];
            int b = ys[(i + 1) % n];
            int h = xs[(i + 1) % n] - xs[i];
            s += (a + b) * h * 0.5;
        }
        s = Math.abs(s);

        int asInt = (int) s;
        return asInt == s ? String.valueOf(asInt) : String.valueOf(s);
    }
}
