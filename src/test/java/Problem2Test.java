import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Problem2Test {

    @Test
    public void testBubbleSort() {
        int inputs[][] = {
                {},
                {3},
                {9, 3, 4, 8},
                {2, 8, 4, 10, 20},
                {75, 3, 0, 43, 57, 100},
                {20, 43, -1, 3, 15, 36, 63}
        };

        int expected[][] = {
                {},
                {3},
                {3, 4, 8, 9},
                {2, 4, 8, 10, 20},
                {0, 3, 43, 57, 75, 100},
                {-1, 3, 15, 20, 36, 43, 63}
        };

        for (int i=0; i<inputs.length; i++) {
            Problem2.bubbleSort(inputs[i]);
            try {
                assertArrayEquals(expected[i], inputs[i]);
            } catch (AssertionError e) {
                System.out.println("Test case " + i + " has failed. " + e);
                Assert.fail();
            }
        }
    }
}
