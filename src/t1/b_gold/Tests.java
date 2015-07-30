package t1.b_gold;

import org.junit.Test;

import java.util.Scanner;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * Created by Администратор on 06.07.2015.
 */
public class Tests {

    @Test
    public void testEx1() {
        String input = "6\n" +
                        "200 100\n" +
                        "200 155\n" +
                        "6150 4100\n" +
                        "1500 750\n" +
                        "315 310\n" +
                        "96 64";
        String output = "4";

        assertThat(solver.solve(new Scanner(input)), equalTo(output));
    }

    @Test
    public void testEx2() {
        String input = "4\n" +
                "768 96\n" +
                "1300 477\n" +
                "1000 125\n" +
                "32000 3200";
        String output = "3";

        assertThat(solver.solve(new Scanner(input)), equalTo(output));
    }

}
