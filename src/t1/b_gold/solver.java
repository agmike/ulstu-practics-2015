package t1.b_gold;

import java.util.*;

/**
 * Created by Администратор on 06.07.2015.
 */
public class solver {

    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
    }

    public static int gcd(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    static class Ratio {
        public final int nom;
        public final int den;

        public Ratio(int nom, int den) {
            int common = gcd(nom, den);
            nom /= common;
            den /= common;
            this.nom = nom;
            this.den = den;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Ratio ratio = (Ratio) o;

            if (nom != ratio.nom) return false;
            return den == ratio.den;
        }

        @Override
        public int hashCode() {
            int result = nom;
            result = 31 * result + den;
            return result;
        }
    }

    public static String solve(Scanner input) {
        int count = input.nextInt();
        Map<Ratio, Integer> ratios = new HashMap<Ratio, Integer>();
        for (int i = 0; i < count; ++i) {
            int totalMass = input.nextInt();
            int goldMass = input.nextInt();
            Ratio r = new Ratio(totalMass, goldMass);
            if (ratios.containsKey(r)) {
                ratios.put(r, ratios.get(r) + 1);
            } else {
                ratios.put(r, 1);
            }
        }
        return String.valueOf(ratios.size());
    }
}
