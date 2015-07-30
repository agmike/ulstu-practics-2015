package t1.f_checker;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void ex1() {
        String in = "2000 8000 5\n" +
                "1 2 3 4 5\n" +
                "OK\n" +
                "953 4200 1\n" +
                "1035 4300 2\n" +
                "985 4315 3\n" +
                "1500 5200 4\n" +
                "1800 7300 5";
        assertEquals("Accepted", solver.solve(new Scanner(in)));
    }

    @Test
    public void ex2() {
        String in = "2000 8000 5\n" +
                "1 2 3 4 5\n" +
                "OK\n" +
                "900 4200 1\n" +
                "1200 6600 2\n" +
                "1800 8020 3\n" +
                "2200 9200 4\n" +
                "3285 10000 5";
        assertEquals("Memory Limit Exceeded on test 3", solver.solve(new Scanner(in)));
    }

    @Test
    public void ex3() {
        String in = "2000 8000 5\n" +
                "1 2 3 4 5\n" +
                "Error (11, 2): Missing ';'";
        assertEquals("Compilation Error", solver.solve(new Scanner(in)));
    }
}
