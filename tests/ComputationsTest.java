import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ComputationsTest {

    @Test
    public void addTestReturnFour(){
        Computations computations = new Computations();
        assertTrue(computations.add(3,3) == 6);
    }

    @Test
    public void subtractTestReturnFive(){
        Computations computations = new Computations();
        assertTrue(computations.subtract(10,5) == 5);
    }

    @Test
    public void divideTestReturnTwo(){
        Computations computations = new Computations();
        assertTrue(computations.divide(20,10) == 2);
    }

    @Test
    public void multiplyReturnTwenty(){
        Computations computations = new Computations();
        assertTrue(computations.multiply(2,10) == 20);
    }

}
