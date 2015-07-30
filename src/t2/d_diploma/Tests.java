package t2.d_diploma;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Администратор on 17.07.2015.
 */
public class Tests {

    @Test
    public void ex1() {
        String in = "10\n" +
                "Physics 4\n" +
                "Algebra_and_geometry 4\n" +
                "High_level_programming 5\n" +
                "Web_programming 5\n" +
                "Mathematical_analysis 5\n" +
                "Physics 4\n" +
                "History 5\n" +
                "Algorithms_and_data_structures 5\n" +
                "Philosophy 5\n" +
                "Discrete_mathematics 5";
        String out = "YES";
        assertEquals(out, solver.solve(new Scanner(in)));
    }

    @Test
    public void ex2() {
        String in = "5\n" +
                "Applied_programming 5\n" +
                "Economics 5\n" +
                "Digital_electronics 3\n" +
                "Probability_theory 4\n" +
                "Computational_mathematics 5";
        String out = "NO";
        assertEquals(out, solver.solve(new Scanner(in)));
    }
}
