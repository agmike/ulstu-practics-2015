package t2.e_comission;

import java.util.*;

public class solver {
    public static void main(String[] args) {
        System.out.print(solve(new Scanner(System.in)));
    }

    public static String solve(Scanner in) {
        int count = in.nextInt();
        int pos = in.nextInt();
//        List<Integer> times = new ArrayList<>(count);
        int longestTime = 0;
        int totalTime = 0;
        for (int i = 0; i < count; i++) {
            int formTime = in.nextInt();
            if (formTime > longestTime) {
                longestTime = formTime;
            }
            totalTime += formTime;
        }
        return String.valueOf(longestTime * (pos - 1) + totalTime);
    }
}
