package t2.h_choosing_tasks;

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
                "4\n" +
                "5 3\n" +
                "2 5 5";
        String out = "14";
        assertEquals(out, solver.solve(new Scanner(in)));
    }

    @Test
    public void ex2() {
        String in = "5\n" +
                "10\n" +
                "4 7\n" +
                "5 10 2\n" +
                "1 4 9 4\n" +
                "10 7 1 9 1";
        String out = "45";
        assertEquals(out, solver.solve(new Scanner(in)));
    }

    @Test
    public void oneDay() {
        String in = "1\n" +
                "1";
        String out = "1";
        assertEquals(out, solver.solve(new Scanner(in)));
    }

    @Test
    public void twoDays() {
        String in = "2\n" +
                "1\n" +
                "2 3";
        String out = "4";
        assertEquals(out, solver.solve(new Scanner(in)));
    }
}
