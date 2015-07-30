package t1.j_max;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void ex1() {
        String in = "4\n" +
                "0 0\n" +
                "0 2\n" +
                "2 2\n" +
                "2 0";
        assertEquals("4", solver.solve(new Scanner(in)));
    }

    @Test
    public void ex2() {
        String in = "5\n" +
                "0 0\n" +
                "0 2\n" +
                "2 2\n" +
                "2 1\n" +
                "1 0";
        assertEquals("3.5", solver.solve(new Scanner(in)));
    }

    @Test
    public void neg() {
        String in = "3\n" +
                "0 0\n" +
                "0 -2\n" +
                "2 0";
        assertEquals("2", solver.solve(new Scanner(in)));
    }
}
