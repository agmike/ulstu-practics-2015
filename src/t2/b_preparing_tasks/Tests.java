package t2.b_preparing_tasks;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Администратор on 17.07.2015.
 */
public class Tests {

    @Test
    public void ex1() {
        String in = "5 8\n" +
                "1 00:45\n" +
                "2 00:25\n" +
                "3 01:15\n" +
                "1 00:30\n" +
                "4 02:45\n" +
                "5 01:00\n" +
                "5 01:20\n" +
                "6 00:50";
        String out = "240";
        assertEquals(out, solver.solve(new Scanner(in)));
    }

    @Test
    public void ex2() {
        String in = "5 5\n" +
                "1 00:55\n" +
                "2 01:15\n" +
                "2 00:30\n" +
                "3 01:00\n" +
                "4 01:25";
        String out = "-1";
        assertEquals(out, solver.solve(new Scanner(in)));
    }
}
