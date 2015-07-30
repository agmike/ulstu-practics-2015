package t1.g_keys;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void ex1() {
        String in = "5 4 5\n" +
                "1 2\n" +
                "2 3\n" +
                "3 4\n" +
                "3 5";
        String out = "Mark 1 as visited\n" +
                "Go to 2\n" +
                "Mark 2 as visited\n" +
                "Go to 3\n" +
                "Mark 3 as visited\n" +
                "Go to 4\n" +
                "Mark 4 as visited\n" +
                "Return back\n" +
                "Go to 5\n" +
                "Keys found!";
        assertEquals(out, solver.solve(new Scanner(in)));
    }

    @Test
    public void ex2() {
        String in = "6 13 6\n" +
                "3 2\n" +
                "3 5\n" +
                "1 2\n" +
                "4 1\n" +
                "6 1\n" +
                "2 6\n" +
                "2 5\n" +
                "5 6\n" +
                "6 3\n" +
                "1 5\n" +
                "1 3\n" +
                "2 4\n" +
                "3 4";
        String out = "Mark 1 as visited\n" +
                "Go to 2\n" +
                "Mark 2 as visited\n" +
                "Go to 4\n" +
                "Mark 4 as visited\n" +
                "1 is already visited\n" +
                "Return back\n" +
                "Go to 5\n" +
                "Mark 5 as visited\n" +
                "Go to 6\n" +
                "Keys found!";
        assertEquals(out, solver.solve(new Scanner(in)));
    }
}
