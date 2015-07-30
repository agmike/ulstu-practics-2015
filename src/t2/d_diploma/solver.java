package t2.d_diploma;

import java.util.*;

public class solver {
    public static void main(String[] args) {
        System.out.print(solve(new Scanner(System.in)));
    }

    public static String solve(Scanner in) {
        int count = in.nextInt();
        Map<String, Integer> results = new HashMap<>();
        for (int i = 0; i < count; i++) {
            String discipline = in.next();
            int mark = in.nextInt();
            if (mark < 4) {
                return "NO";
            }
            results.put(discipline, mark);
        }

        int totalMark = 0;
        for (int mark : results.values()) {
            totalMark += mark;
        }
        return totalMark >= 4.75 * results.size() ? "YES" : "NO";
    }
}
