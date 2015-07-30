package t1.i_test_better;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void ex1() {
        assertEquals("132", solver.solve(new Scanner("123 6")));
    }

    @Test
    public void ex2() {
        assertEquals("35704", solver.solve(new Scanner("74530 4")));
    }
}
