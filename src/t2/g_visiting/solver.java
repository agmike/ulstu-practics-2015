package t2.g_visiting;

import java.util.Scanner;

public class solver {

    private static int count;
    private static int[][] g;
    private static boolean[] visited;
    private final static int MAX = 10_000;

    public static void main(String[] args) {
        System.out.print(solve(new Scanner(System.in)));
    }

    static String solve(Scanner in) {
        count = in.nextInt();
        g = new int[count][count];
        visited = new boolean[count];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                g[i][j] = in.nextInt();
            }
        }

        int min = MAX;
        for (int i = 0; i < count; i++) {
            int dist = shortest(i);
            if (dist < min) {
                min = dist;
            }
        }

        return String.valueOf(min);
    }

    static int shortest(int current) {
        visited[current] = true;
        int min = MAX;
        for (int i = 0; i < count; i++) {
            if (!visited[i]) {
                int subDist = g[current][i] + shortest(i);
                if (subDist < min) {
                    min = subDist;
                }
            }
        }
        visited[current] = false;
        return min == MAX ? 0 : min;
    }
}
