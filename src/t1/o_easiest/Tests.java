package t1.o_easiest;

import org.junit.Test;

public class Tests {

    @Test(timeout = 2000L)
    public void test() throws InterruptedException {
        while (true) {
            Thread.sleep(1);
            if (solver.solve().equals("YES") && solver.solve().equals("NO")) {
                return;
            }
        }
    }
}
