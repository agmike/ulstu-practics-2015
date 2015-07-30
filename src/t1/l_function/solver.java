package t1.l_function;

import java.util.Arrays;
import java.util.Scanner;

public class solver {
    public static void main(String[] args) {
        System.out.print(solve(new Scanner(System.in)));
    }

    static String solve(Scanner in) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                Arrays.fill(table[i][j], Integer.MIN_VALUE);
            }
        }
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        M = in.nextInt();
        return Integer.toString(F(a, b, c));
    }

    static int[][][] table = new int[31][31][31];
    static int M;

    static int F(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 1;
        } else if (a > 30 || b > 30 || c > 30) {
            return F(Math.min(a, 30), Math.min(b, 30), Math.min(c, 30));
        } else if (table[a][b][c] != Integer.MIN_VALUE) {
            return table[a][b][c];
        } else {
            int f;
            if (a > b && a > c) f = (F(a-2,b,c)+F(a-1,b-1,c)+F(a-1,b,c-1)) % M;
            else if (b > a && b > c) f = (F(a,b-2,c)+F(a,b-1,c)+F(a,b-1,c-1)) % M;
            else if (c > a && c > b) f = (F(a,b,c-3)+F(a-1,b,c-1)+F(a,b-1,c-1)) % M;
            else f = (F(a-1,b,c)+F(a,b-1,c)+F(a,b,c-1)) % M;
            table[a][b][c] = f;
            return f;
        }
    }
}
