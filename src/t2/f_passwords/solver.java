package t2.f_passwords;

import java.util.Scanner;

public class solver {
    public static void main(String[] args) {
        System.out.print(solve(new Scanner(System.in)));
    }

    public static String solve(Scanner in) {
        int n = in.nextInt();
        int digits = in.nextInt();
        int small = in.nextInt();
        int big = in.nextInt();

        digits = n - small - big;

        StringBuilder out = new StringBuilder(n);
        for (int i = 0; i < digits; i++) {
            out.append(i % 2 == 0 ? '0' : '1');
        }
        for (int i = 0; i < small; i++) {
            out.append(i % 2 == 0 ? 'a' : 'b');
        }
        for (int i = 0; i < big; i++) {
            out.append(i % 2 == 0 ? 'A' : 'B');
        }

        return out.toString();
    }
}
