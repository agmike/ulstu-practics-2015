package t1.l_function;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void ex1() {
        assertEquals("55", solver.solve(new Scanner("3 2 3 100")));
    }
    @Test
    public void ex2() {
        assertEquals("28", solver.solve(new Scanner("5 5 5 97")));
    }
    @Test(timeout = 2000L)
    public void timelimit() {
        assertEquals("97", solver.solve(new Scanner("1000 1000 1000 100")));
    }
}
