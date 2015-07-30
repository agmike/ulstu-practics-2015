package t2.h_choosing_tasks;

import java.util.Scanner;

public class solver {
    public static void main(String[] args) {
        System.out.print(solve(new Scanner(System.in)));
    }

    public static String solve(Scanner in) {
        int days = in.nextInt();
        int[] points = new int[days * (days + 1) / 2];
        int count = 0;
        for (int i = 0; i < days; i++) {
            for (int j = 0; j < i + 1; j++) {
                points[count++] = in.nextInt();
            }
        }

        for (int day = days - 2; day >= 0; day--) {
            int dayTasks = day + 1;
            int start = day * (day + 1) / 2;
            int nextStart = start + dayTasks;
            for (int i = 0; i < dayTasks; i++) {
                points[start + i] += Math.max(points[nextStart + i], points[nextStart +i + 1]);
            }
        }
        return String.valueOf(points[0]);
    }
}
