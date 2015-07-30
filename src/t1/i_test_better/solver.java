package t1.i_test_better;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class solver {
    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
    }

    static String solve(Scanner in) {
        int num = in.nextInt();
        int div = in.nextInt();
        int digits = (int) Math.log10(num) + 1;
        int dec = 1;
        for (int i = 0; i < digits; i++) {
            dec *= 10;
        }
        dec /= 10;

        Set<Integer> perms = new HashSet<>();
        permutations(num, digits, 0, perms);
        int best = -1;
        for (int i : perms) {
            boolean lesser = best <= 0 || i < best;
            boolean divisible = i % div == 0;
            boolean noLeadingZeros = i / dec != 0;
            if (lesser && divisible && noLeadingZeros) {
                best = i;
            }
        }
        return String.valueOf(best);
    }

    static void permutations(int num, int digits, int digit, Set<Integer> set) {
        set.add(num);
        for (int permuteDigit = digit; permuteDigit < digits; ++permuteDigit) {
            int permuted = permute(num, digit, permuteDigit);
            permutations(permuted, digits, digit + 1, set);
        }
    }

    static int permute(int source, int i, int j) {
        int ret = source;
        int idec = 1;
        for (int k = 0; k < i; k++) {
            idec *= 10;
        }
        int jdec = 1;
        for (int k = 0; k < j; k++) {
            jdec *= 10;
        }
        int si = (source % (idec * 10)) / idec;
        int sj = (source % (jdec * 10)) / jdec;
        ret = (ret / (jdec * 10)) * (jdec * 10) + si * jdec + (ret % jdec);
        ret = (ret / (idec * 10)) * (idec * 10) + sj * idec + (ret % idec);
        return ret;
    }
}