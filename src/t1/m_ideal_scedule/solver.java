package t1.m_ideal_scedule;

import java.util.Scanner;

public class solver {
    public static void main(String[] args) {
        System.out.print(solve(new Scanner(System.in)));
    }

    static String solve(Scanner in) {
        int size = in.nextInt();
        int[][] s = new int[size][size];

        int num = 1;
        fw = new int[size][size];
        bw = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                fw[i][j] = num;
                bw[size - 1 - i][size - 1 - j] = num;
                ++num;
            }
        }

//        fill(s, 0, 0, size, true);
        fill(s, size);

        StringBuilder out = new StringBuilder();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                out.append(s[i][j]).append(' ');
            }
            out.append('\n');
        }
        return out.toString();
    }

//    static void fill(int[][] s, int i0, int j0, int n, boolean isFw) {
    static void fill(int[][] s, int n) {
//        if (n < 4) {
//            for (int i = i0; i < i0 + n; i++) {
//                for (int j = j0; j < j0 + n; j++) {
//                    s[i][j] = (isFw ? fw : bw)[i][j];
//                }
//            }
//            return;
//        }
        int k = n / 4;
        for (int i0 = 0; i0 < 4; i0++) {
            for (int j0 = 0; j0 < 4; j0++) {
//                fill(s, i0 + k * i, j0 + k * j, k, kind[i][j] == isFw);
                int is = i0 * k;
                int js = j0 * k;
                for (int i = is; i < is + k; i++) {
                    for (int j = js; j < js + k; j++) {
                        s[i][j] = (kind[i0][j0] ? fw : bw)[i][j];
                    }
                }
            }
        }
    }

    static boolean[][] kind = new boolean[][] {
            { true, false, false, true },
            { false, true, true, false },
            { false, true, true, false },
            { true, false, false, true }
    };
    static int[][] fw;
    static int[][] bw;
}
