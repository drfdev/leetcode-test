package dev.drf.leetcode.range.sum.query.immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RangeSumQueryImmutableProblemTest {

    @Test
    void example1() {
        /*
        Input
        ["NumArray", "sumRange", "sumRange", "sumRange"]
        [[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
        Output
        [null, 1, -1, -3]
         */

//        Explanation
//        NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
//        numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
//        numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
//        numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
        var numArray = new RangeSumQueryImmutableProblem.NumArray(new int[] {-2, 0, 3, -5, 2, -1});
        var v1 = numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
        var v2 = numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
        var v3 = numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3

        assertEquals(1, v1);
        assertEquals(-1, v2);
        assertEquals(-3, v3);
    }
}
