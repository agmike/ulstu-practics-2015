package t2.c_mixer;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Created by Администратор on 17.07.2015.
 */
public class Tests {

    @Test
    public void ex1() {
        String in = "7\n" +
                "0.1524 Too cold!\n" +
                "0.7589 Too hot!\n" +
                "0.3219 Too hot!\n" +
                "0.7604 Too hot!\n" +
                "0.0951 Too cold!\n" +
                "0.2458 Too cold!\n" +
                "0.1868 Too cold!";
        String out = "0.2458 0.3219";
        assertEquals(out, solver.solve(new Scanner(in)));
    }

    @Test
    public void ex2() {
        String in = "6\n" +
                "0.3042 Too cold!\n" +
                "0.5267 Too cold!\n" +
                "0.6186 Too hot!\n" +
                "0.7707 Too hot!\n" +
                "0.6802 Too hot!\n" +
                "0.9789 Too cold!";
        String out = "-1 -1";
        assertEquals(out, solver.solve(new Scanner(in)));
    }
}
