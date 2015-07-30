package t1.d_students;


import org.junit.Test;

import java.util.Scanner;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class Tests {

//    public static class TreeArray {
//        TreeArray left, right;
//        int value = 0;
//
//        public TreeArray(int cap) {
//            if (cap > 0) {
//                left = new TreeArray(cap >> 1);
//                right = new TreeArray(cap >> 1);
//            }
//        }
//
//        public int sum() {
//            return value;
//        }
//
//        public int get(int index) {
//            if (left != null) {
//                if ((index & 1) == 1) {
//                    return left.get(index >> 1);
//                } else {
//                    return right.get(index >> 1);
//                }
//            }
//            return value;
//        }
//
//        public void set(int index, int value) {
//            if (left != null) {
//                if ((index & 1) == 1) {
//                    left.set(index >> 1, value);
//                } else {
//                    right.set(index >> 1, value);
//                }
//                this.value = left.sum() + right.sum();
//            } else {
//                this.value = value;
//            }
//        }
//
//        public void remove(int index) { set(index, 0); }
//    }
//    @Test
//    public void testTreeArray() {
//        solver.TreeArray tree = new solver.TreeArray(10);
//
//        tree.set(0, 1);
//        assertThat(tree.get(0), equalTo(1));
//
//        tree.set(1, 2);
//        assertThat(tree.get(1), equalTo(2));
//        assertThat(tree.sum(), equalTo(3));
//
//        tree.set(9, 10);
//        assertThat(tree.get(9), equalTo(10));
//        assertThat(tree.sum(), equalTo(13));
//    }

    @Test
    public void testEx1() {
        String input = "6\n" +
                "228 224 236 236 233 228";
        String output = "1";
        assertThat(solver.solve(new Scanner(input)), equalTo(output));
    }

    @Test
    public void testEx2() {
        String input = "6\n" +
                "223 231 220 238 240 221";
        String output = "5";
        assertThat(solver.solve(new Scanner(input)), equalTo(output));
    }

    @Test
    public void one() {
        String input = "1\n" +
                "223";
        String output = "223";
        assertThat(solver.solve(new Scanner(input)), equalTo(output));
    }

    @Test
    public void oneEven() {
        String input = "1\n" +
                "224";
        String output = "224";
        assertThat(solver.solve(new Scanner(input)), equalTo(output));
    }

    @Test
    public void two() {
        String input = "2\n" +
                "224 225";
        String output = "1";
        assertThat(solver.solve(new Scanner(input)), equalTo(output));
    }

    @Test
    public void twoEven() {
        String input = "2\n" +
                "224 226";
        String output = "2";
        assertThat(solver.solve(new Scanner(input)), equalTo(output));
    }

    @Test
    public void twoOdd() {
        String input = "2\n" +
                "223 225";
        String output = "2";
        assertThat(solver.solve(new Scanner(input)), equalTo(output));
    }
}
