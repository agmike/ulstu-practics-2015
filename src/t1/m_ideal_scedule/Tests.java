package t1.m_ideal_scedule;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void ex1() {
        String in = "4";
        String out = "1 15 14 4 \n" +
                "12 6 7 9 \n" +
                "8 10 11 5 \n" +
                "13 3 2 16 \n";
        assertEquals(out, solver.solve(new Scanner(in)));
    }

    @Test
    public void ex2() {
        String in = "8";
        String out = "1 2 62 61 60 59 7 8 \n" +
                "9 10 54 53 52 51 15 16 \n" +
                "48 47 19 20 21 22 42 41 \n" +
                "40 39 27 28 29 30 34 33 \n" +
                "32 31 35 36 37 38 26 25 \n" +
                "24 23 43 44 45 46 18 17 \n" +
                "49 50 14 13 12 11 55 56 \n" +
                "57 58 6 5 4 3 63 64 \n";
        assertEquals(out, solver.solve(new Scanner(in)));
    }

    @Test
    public void t5() {
        String in = "20";
        String out = "";
        assertEquals(out, solver.solve(new Scanner(in)));
    }
}
