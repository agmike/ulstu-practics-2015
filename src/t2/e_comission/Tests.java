package t2.e_comission;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Администратор on 17.07.2015.
 */
public class Tests {

    @Test
    public void ex1() {
        String in = "5 5\n" +
                "1 1 1 1 1";
        String out = "9";
        assertEquals(out, solver.solve(new Scanner(in)));
    }

    @Test
    public void ex2() {
        String in = "5 1\n" +
                "1 2 1 3 2";
        String out = "9";
        assertEquals(out, solver.solve(new Scanner(in)));
    }

    @Test
    public void ex3() {
        String in = "2 5\n" +
                "1 2";
        String out = "11";
        assertEquals(out, solver.solve(new Scanner(in)));
    }

    @Test
    public void calc() {
        String in = "5 3\n" +
                "2 3 4 7 1";
        System.out.print(solver.solve(new Scanner(in)));
    }
}
