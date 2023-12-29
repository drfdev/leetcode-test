package dev.drf.leetcode.maximum.value.of.an.ordered.triplet.ii;

import dev.drf.leetcode.maximum.value.of.an.ordered.triplet.i.MaximumValueOfAnOrderedTripletIProblem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumValueOfAnOrderedTripletIIProblemTest {
    private final MaximumValueOfAnOrderedTripletIIProblem problem = new MaximumValueOfAnOrderedTripletIIProblem();

    @Test
    void example1() {
        /*
        Input: nums = [12,6,1,2,7]
        Output: 77
         */
        int[] nums = new int[]{
                12, 6, 1, 2, 7
        };

        var res = problem.maximumTripletValue(nums);

        assertEquals(77, res);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,10,3,4,19]
        Output: 133
         */
        int[] nums = new int[]{
                1, 10, 3, 4, 19
        };

        var res = problem.maximumTripletValue(nums);

        assertEquals(133, res);
    }

    @Test
    void example3() {
        /*
        Input: nums = [1,2,3]
        Output: 0
         */
        int[] nums = new int[]{
                1, 2, 3
        };

        var res = problem.maximumTripletValue(nums);

        assertEquals(0, res);
    }
}
