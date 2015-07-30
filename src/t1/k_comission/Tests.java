package t1.k_comission;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void ex1() {
        String in = "5 0 0\n" +
                "10 10 Ivanov\n" +
                "10 10 Petrov\n" +
                "55 40 Sidorov\n" +
                "70 10 Mikhailov\n" +
                "22 100 Ilyin";
        String out = "Ivanov 14.14213562\n" +
                "Petrov 14.14213562\n" +
                "Sidorov 68.00735254\n" +
                "Mikhailov 70.71067812\n" +
                "Ilyin 102.39140589\n" +
                "";
        assertEquals(out, solver.solve(new Scanner(in)));
    }

    @Test
    public void ex2() {
        String in = "4 10 30\n" +
                "1 1 Rivest\n" +
                "10 10 Cormen\n" +
                "100 75 Stein\n" +
                "20 5 Leiserson";
        String out = "Cormen 20.00000000\n" +
                "Leiserson 26.92582404\n" +
                "Rivest 30.36445290\n" +
                "Stein 100.62305899\n" +
                "";
        assertEquals(out, solver.solve(new Scanner(in)));
    }
}

