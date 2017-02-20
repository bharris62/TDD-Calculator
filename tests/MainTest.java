import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by BHarris on 2/20/17.
 */
public class MainTest {
    @Test
    public void doComputationReturnAdd(){
        Main main = new Main();
        assertTrue(main.doComputation("a", 2, 2) == 4);
    }

    @Test
    public void doComputationReturnSubtract(){
        Main main = new Main();
        assertTrue(main.doComputation("s", 2, 2) == 0);
    }

    @Test
    public void doComputationReturnMultiply(){
        Main main = new Main();
        assertTrue(main.doComputation("m", 2, 2) == 4);
    }

    @Test
    public void doComputionReturnDivide(){
        Main main = new Main();
        assertTrue(main.doComputation("d", 10,2) == 5);
    }
}
