package t1.e_parallel;

import java.util.Scanner;

public class solver {

    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
    }

    static long max(long a, long b) { return a > b ? a : b; }

    public static String solve(Scanner in) {
        int tasks = in.nextInt();
        int threads = in.nextInt();
        long[] taskTime = new long[tasks];
        long[] taskSum = new long[tasks + 1];
        for (int i = 0; i < tasks; ++i) {
            taskTime[i] = in.nextLong();
            taskSum[i] = i >= 1 ? taskSum[i - 1] + taskTime[i - 1] : 0;
        }
        taskSum[tasks] = taskTime[tasks - 1] + taskSum[tasks - 1];

        int[] threadDiv = new int[threads + 1];
        threadDiv[threads] = tasks;

        long[] maxRight = new long[threads + 1];
        maxRight[threads] = 0;

        while(true) {
            for (int i = threads - 1; i >= 0; --i) {
                maxRight[i] = max(-taskSum[threadDiv[i]] + taskSum[threadDiv[i + 1]], maxRight[i + 1]);
            }
            boolean shift = false;
            for (int i = threads - 2; i >= 0; --i) {
                if (threadDiv[i + 1] != threadDiv[i + 2]) {
                    long left = -taskSum[threadDiv[i]] + taskSum[threadDiv[i + 1] + 1];
                    if (left < maxRight[i + 1]) {
                        threadDiv[i + 1] += 1;
                        shift = true;
                        break;
                    }
                }
            }
            if (!shift) {
                break;
            }
        }

        long maxTime = 0;
        for (int i = 0; i < threads; ++i) {
            long time = -taskSum[threadDiv[i]] + taskSum[threadDiv[i + 1]];
            if (time > maxTime) {
                maxTime = time;
            }
        }
        return String.valueOf(maxTime);
    }
}
