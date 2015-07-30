package t1.h_test_bigger;

import org.junit.Test;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void permute() {
        assertEquals(1, solver.permute(1, 0, 0));
        assertEquals(12345, solver.permute(12345, 4, 4));
        assertEquals(52341, solver.permute(12345, 0, 4));
        assertEquals(10, solver.permute(01, 0, 1));
        assertEquals(1324, solver.permute(1234, 1, 2));
        Set<Integer> set = new HashSet<>();
        solver.permutations(123_456_789, 9, 0, set);
        assertEquals(fact(9), set.size());
    }

    public long fact(int i) {
        int ret = 1;
        for (int j = 1; j <= i; j++) {
            ret *= j;
        }
        return ret;
    }

    @Test
    public void ex1() {
        assertEquals("132", solver.solve(new Scanner("123")));
    }

    @Test
    public void ex2() {
        assertEquals("75034", solver.solve(new Scanner("74530")));
    }
    @Test
    public void t1() {
        assertEquals("-1", solver.solve(new Scanner("1")));
    }
    @Test
    public void t2() {
        assertEquals("-1", solver.solve(new Scanner("11")));
    }
    @Test
    public void t3() {
        assertEquals("21", solver.solve(new Scanner("12")));
    }
    @Test
    public void t4() {
        assertEquals("12345687", solver.solve(new Scanner("12345678")));
    }
}
