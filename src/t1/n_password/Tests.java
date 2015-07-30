package t1.n_password;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

public class Tests {
    @Test
    public void ex1() {
        String in = "adeoprssw\n" +
                "6\n" +
                "pass\n" +
                "word\n" +
                "secret\n" +
                "swap\n" +
                "door\n" +
                "session";
        String out = "3";
        assertEquals(out, t1.n_password.solver.solve(new Scanner(in)));
    }

    @Test
    public void ex2() {
        String in = "nreod\n" +
                "5\n" +
                "road\n" +
                "drone\n" +
                "need\n" +
                "node\n" +
                "roar";
        String out = "2";
        assertEquals(out, t1.n_password.solver.solve(new Scanner(in)));
    }
}
