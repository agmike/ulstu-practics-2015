package t1.a_rng;

import java.util.Scanner;

public class solver {

    public static void main(String[] args) {

        System.out.println(solve(new Scanner(System.in)));
    }

    public static String solve(Scanner input) {
        int inputSize = input.nextInt();

        int lastNumber = -1;
        int lastNumberCount = 0;

        int maxCount = 0;

        for (int i = 0; i < inputSize; ++i) {
            int num = input.nextInt();
            if (num == lastNumber) {
                ++lastNumberCount;
            } else {
                lastNumber = num;
                lastNumberCount = 1;
            }
            if (lastNumberCount > maxCount) {
                maxCount = lastNumberCount;
            }
        }
        return String.valueOf(maxCount);
    }
}
