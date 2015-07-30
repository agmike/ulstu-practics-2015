package t1.c_knight;

import org.junit.Test;

import java.util.Scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by Администратор on 06.07.2015.
 */
public class Tests {
    @Test
    public void testEx1() {
        String input = ".K..K...\n" +
                "K...K...\n" +
                "........\n" +
                "....K...\n" +
                "KK..KK.K\n" +
                "K....K..\n" +
                "........\n" +
                "..K.K..K";
        String output = "YES";

        assertThat(solver.solve(new Scanner(input)), equalTo(output));
    }
    @Test
    public void testEx2() {
        String input = ".KK.....\n" +
                "......K.\n" +
                ".......K\n" +
                ".KKK....\n" +
                "........\n" +
                ".....K..\n" +
                "K.K...K.\n" +
                ".K......";
        String output = "NO";

        assertThat(solver.solve(new Scanner(input)), equalTo(output));
    }
}
