package t1.f_checker;

import java.util.Scanner;

public class solver {
    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
    }

    public static String solve(Scanner in) {

        int time = in.nextInt();
        int mem = in.nextInt();
        int count = in.nextInt();

        int[] answers = new int[count];
        for (int i = 0; i < count; i++) {
            answers[i] = in.nextInt();
        }
        in.nextLine();
        if (!in.nextLine().equals("OK")) {
            return "Compilation Error";
        }

        for (int i = 0; i < count; i++) {
            if (in.nextInt() > time) {
                return String.format("Time Limit Exceeded on test %s", i + 1);
            } else if (in.nextInt() > mem) {
                return String.format("Memory Limit Exceeded on test %s", i + 1);
            } else if (in.nextInt() != answers[i]) {
                return String.format("Wrong Answer on test %s", i + 1);
            }
        }

        return "Accepted";
    }
}
