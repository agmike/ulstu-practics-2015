package t1.n_password;

import java.util.Scanner;

public class solver {
    public static void main(String[] args) {
        System.out.print(solve(new Scanner(System.in)));
    }

    static String solve(Scanner in) {
        String available = in.nextLine();
        for (int i = 0; i < available.length(); i++) {
            letters[available.charAt(i) - 'a'] += 1;
        }
        int n = Integer.parseInt(in.nextLine());
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (possible(in.nextLine())) {
                count += 1;
            }
        }
        return String.valueOf(count);
    }

    static int[] letters = new int[30];

    static boolean possible(String word) {
        int[] letters = solver.letters.clone();
        for (int i = 0; i < word.length(); i++) {
            if (--letters[word.charAt(i) - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
