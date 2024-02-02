package dev.drf.leetcode.sequential.digits;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class SequentialDigitsProblemTest {
    private final SequentialDigitsProblem problem = new SequentialDigitsProblem();

    @Test
    void example1() {
        /*
        Input: low = 100, high = 300
        Output: [123,234]
         */
        int low = 100, high = 300;

        var out = problem.sequentialDigits(low, high);

        assertThat(out, containsInAnyOrder(
                123, 234
        ));
    }

    @Test
    void example2() {
        /*
        Input: low = 1000, high = 13000
        Output: [1234,2345,3456,4567,5678,6789,12345]
         */
        int low = 1000, high = 13000;

        var out = problem.sequentialDigits(low, high);

        assertThat(out, containsInAnyOrder(
                1234, 2345, 3456, 4567, 5678, 6789, 12345
        ));
    }
}
