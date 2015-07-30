package t1.d_students;

import java.util.Scanner;

public class solver {
    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
    }

    public static String solve(Scanner in) {
        int count = in.nextInt();
        int[] score = new int[count];
        int sum = 0;
        for (int i = 0; i < count; ++i) {
            score[i] = in.nextInt();
            sum += score[i];
        }

        if (count == 1) {
            return String.valueOf(score[0]);
        }

        // summable[sum, count] == score[0, count] contains subset with given sum
        // summable[0, *] = true
        // summable[sum, count] = summable[sum, count - 1]
        //                     || summable[sum - score[count], count - 1]
        boolean[][] summable = new boolean[sum / 2 + 1][count + 1];
        for (int c = 0; c < count; ++c) {
            summable[0][c] = true;
        }
        for (int s = 1; s <= sum / 2; ++s) {
            for (int c = 1; c <= count; ++c) {
                int newScore = score[c - 1];
                if (newScore <= s) {
                    summable[s][c] = summable[s][c - 1] || summable[s - newScore][c - 1];
                } else {
                    summable[s][c] = summable[s][c - 1];
                }
            }
        }
        int minDiscrepancy = Integer.MAX_VALUE;
        for (int s = sum / 2; s >= 0; --s) {
            for (int c = 0; c <= count; ++c) {
                if (summable[s][count]) {
                    int discrepancy = Math.abs(s - (sum - s));
                    if (discrepancy < minDiscrepancy) {
                        minDiscrepancy = discrepancy;
                    }
                }
            }
        }
        return String.valueOf(minDiscrepancy);
    }
}
