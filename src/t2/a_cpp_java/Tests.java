package t2.a_cpp_java;

import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.*;

/**
 * Created by Администратор on 17.07.2015.
 */
public class Tests {

    @Test
    public void ex1() {
        assertEquals("selectionSort", solver.solve(new Scanner("selection_sort")));
    }

    @Test
    public void ex2() {
        assertEquals("key_value_pair", solver.solve(new Scanner("keyValuePair")));
    }

    @Test
    public void singleWord() {
        assertEquals("name", solver.solve(new Scanner("name")));
    }
}
