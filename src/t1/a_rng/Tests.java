package t1.a_rng;

import org.junit.Test;

import java.util.Scanner;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.assertThat;

/**
 * Created by Администратор on 06.07.2015.
 */
public class Tests {
    @Test
    public void testExample1() {
        String input =
                "10\n" +
                "3\n" +
                "3\n" +
                "0\n" +
                "0\n" +
                "0\n" +
                "9\n" +
                "9\n" +
                "9\n" +
                "0\n" +
                "0";
        String output = "3";

        assertThat(solver.solve(new Scanner(input)), equalTo(output));
    }

    @Test
    public void testExample2() {
        String input =
                "10\n" +
                "0\n" +
                "0\n" +
                "9\n" +
                "9\n" +
                "5\n" +
                "5\n" +
                "7\n" +
                "2\n" +
                "2\n" +
                "9";
        String output = "2";

        assertThat(solver.solve(new Scanner(input)), equalTo(output));
    }

    @Test
    public void testSingleNumber() {
        String input =
                "1\n" +
                "1\n";
        String output = "1";

        assertThat(solver.solve(new Scanner(input)), equalTo(output));
    }

    @Test
    public void testAllSame() {
        String input =
                "5\n" +
                "1\n" +
                "1\n" +
                "1\n" +
                "1\n" +
                "1\n";
        String output = "5";

        assertThat(solver.solve(new Scanner(input)), equalTo(output));
    }
}
