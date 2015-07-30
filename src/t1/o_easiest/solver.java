package t1.o_easiest;

import java.util.Random;

public class solver {
    public static void main(String[] args) {
        System.out.print(solve());
    }

    static String solve() {
        Random rng = new Random();
        return rng.nextBoolean() ? "YES" : "NO";
    }
}
