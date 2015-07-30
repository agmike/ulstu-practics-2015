package t2.c_mixer;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.*;

public class solver {
    public static void main(String[] args) {
        System.out.print(solve(new Scanner(System.in)));
    }

    public static String solve(Scanner in) {
        in.useLocale(Locale.US);
        int count = in.nextInt();
        List<Sample> samples = new ArrayList<>(count + 2);
        samples.add(new Sample(false, 0));
        for (int i = 0; i < count; i++) {
            double value = in.nextDouble();
            in.next();
            boolean isHot = in.next().equals("hot!");
            samples.add(new Sample(isHot, value));
        }
        samples.add(new Sample(true, 1));
        Collections.sort(samples);

        DecimalFormatSymbols syms = new DecimalFormatSymbols();
        syms.setDecimalSeparator('.');
        DecimalFormat fmt = new DecimalFormat("0.0000", syms);

        String answer = null;
        for (int i = 0; i < samples.size() - 1; i++) {
            if (!samples.get(i).isHot && samples.get(i + 1).isHot) {
                if (answer == null) {
                    answer = fmt.format(samples.get(i).value) + " " + fmt.format(samples.get(i + 1).value);
                } else {
                    return "-1 -1";
                }
            }
        }
        return answer;
    }

    static class Sample implements Comparable<Sample> {
        public final double value;
        public final boolean isHot;

        public Sample(boolean isHot, double value) {
            this.isHot = isHot;
            this.value = value;
        }

        @Override
        public int compareTo(Sample o) {
            return Double.compare(value, o.value);
        }
    }
}
