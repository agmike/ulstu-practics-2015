package t1.c_knight;

import java.util.Scanner;

/**
 * Created by Администратор on 06.07.2015.
 */
public class solver {

    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
    }

    public static String solve(Scanner input) {
        char[][] field = new char[8][];
        for (int i = 0; i < 8; ++i) {
            field[i] = input.nextLine().toCharArray();
        }

        int[][] moves = new int[][] {
                new int[] { -2, -1 },
                new int[] { -2, 1 },
                new int[] { -1, 2 },
                new int[] { 1, 2 },
                new int[] { 2, 1 },
                new int[] { 2, -1 },
                new int[] { 1, -2 },
                new int[] { -1, -2 },
        };

        for (int i = 0; i < 8; ++i) {
            for (int j = 0; j < 8; ++j) {
                for (int k = 0; k < moves.length; ++k) {
                    if (hasKnight(field, i, j) && hasKnight(field, i + moves[k][0], j + moves[k][1])) {
                        return "YES";
                    }
                }
            }
        }
        return "NO";
    }

    private static boolean hasKnight(char[][] field, int i, int j) {
        if (0 <= i && i < 8 && 0 <= j && j < 8) {
            return field[i][j] == 'K';
        }
        return false;
    }
}
