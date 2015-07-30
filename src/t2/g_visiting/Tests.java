package t2.g_visiting;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Администратор on 17.07.2015.
 */
public class Tests {

    @Test
    public void ex1() {
        String in = "3\n" +
                "0 4 2\n" +
                "5 0 3\n" +
                "2 4 0";
        String out = "5";
        assertEquals(out, solver.solve(new Scanner(in)));
    }

    @Test
    public void ex2() {
        String in = "5\n" +
                "0 3 8 3 7\n" +
                "4 0 9 5 6\n" +
                "1 8 0 1 4\n" +
                "5 9 7 0 1\n" +
                "1 7 1 1 0";
        String out = "6";
        assertEquals(out, solver.solve(new Scanner(in)));
    }

    @Test(timeout = 2000L)
    public void timeout() {
        String in = "9\n" +
                "0 3 8 3 7 5 5 5 5\n" +
                "4 0 9 5 6 5 5 5 5\n" +
                "1 8 0 1 4 5 5 5 5\n" +
                "5 9 7 0 1 5 5 5 5\n" +
                "5 9 7 0 1 5 5 5 5\n" +
                "5 9 7 0 1 5 5 5 5\n" +
                "5 9 7 0 1 5 5 5 5\n" +
                "5 9 7 0 1 5 5 5 5\n" +
                "1 7 1 1 0 5 5 5 5";
        System.out.print(solver.solve(new Scanner(in)));
    }
}
