package t1.k_comission;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class solver {
    public static void main(String[] args) {
        System.out.println(solve(new Scanner(System.in)));
    }

    static class Student implements Comparable<Student> {
        public String name;
        public long squaredDistance;

        public Student(String name, long squaredDistance) {
            this.name = name;
            this.squaredDistance = squaredDistance;
        }

        @Override
        public int compareTo(Student o) {
            int cmp = Long.compare(squaredDistance, o.squaredDistance);
            if (cmp != 0) {
                return cmp;
            }
            return name.compareTo(o.name);
        }
    }

    static long sqr(long x) {
        return x * x;
    }

    static String solve(Scanner in) {
        int count = in.nextInt();
        long x0 = in.nextLong();
        long y0 = in.nextLong();
        List<Student> students = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            long x = in.nextLong();
            long y = in.nextLong();
            String name = in.next();
            students.add(new Student(name, sqr(x - x0) + sqr(y - y0)));
        }
        Collections.sort(students);
        StringBuilder out = new StringBuilder();
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setDecimalSeparator('.');
        DecimalFormat format = new DecimalFormat("0.00000000", dfs);
        for (Student s : students) {
            out.append(s.name).append(' ').append(format.format(Math.sqrt(s.squaredDistance))).append('\n');
        }
        return out.toString();
    }
}
