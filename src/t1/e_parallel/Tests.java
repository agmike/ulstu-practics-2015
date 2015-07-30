package t1.e_parallel;

import org.junit.Test;

import java.util.Scanner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class Tests {
    @Test
    public void testEx1() {
        String input = "5 2\n" +
                "1 2 1 3 2";
        assertThat(solver.solve(new Scanner(input)), equalTo("5"));
    }
    @Test
    public void testEx2() {
        String input = "5 3\n" +
                "1 2 1 3 2";
        assertThat(solver.solve(new Scanner(input)), equalTo("4"));
    }
    @Test
    public void testSingleThreaded() {
        String input = "5 1\n" +
                "1 2 1 3 2";
        assertThat(solver.solve(new Scanner(input)), equalTo("9"));
    }
    @Test
    public void testSingleTask() {
        String input = "1 5\n" +
                "4";
        assertThat(solver.solve(new Scanner(input)), equalTo("4"));
    }
    @Test
    public void testCons() {
        String input = "8 3\n" +
                "1 2 3 4 5 6 7 8";
        //         6  | 15  | 15
        assertThat(solver.solve(new Scanner(input)), equalTo("15"));
    }
    @Test
    public void testSame() {
        String input = "8 3\n" +
                "1 1 1 1 1 1 1 1";
        assertThat(solver.solve(new Scanner(input)), equalTo("3"));
    }
    @Test
    public void test1() {
        String input = "8 8\n" +
                "10 1 1 1 1 1 1 1";
        assertThat(solver.solve(new Scanner(input)), equalTo("10"));
    }
    @Test
    public void test2() {
        String input = "8 8\n" +
                "1 1 1 1 1 1 1 10";
        assertThat(solver.solve(new Scanner(input)), equalTo("10"));
    }
    @Test
    public void test3() {
        String input = "6 3\n" +
                "1 2 1 2 1 2";
        assertThat(solver.solve(new Scanner(input)), equalTo("3"));
    }
    @Test
    public void test4() {
        String input = "7 3\n" +
                "1 2 3 10 3 2 1";
        assertThat(solver.solve(new Scanner(input)), equalTo("10"));
    }
}
