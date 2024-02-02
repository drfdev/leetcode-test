package dev.drf.leetcode.count.pairs.whose.sum.is.less.than.target;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountPairsWhoseSumIsLessThanTargetProblemTest {
    private final CountPairsWhoseSumIsLessThanTargetProblem problem = new CountPairsWhoseSumIsLessThanTargetProblem();

    @Test
    void example1() {
        /*
        Input: nums = [-1,1,2,3,1], target = 2
        Output: 3
         */
        List<Integer> nums = new ArrayList<>(List.of(-1, 1, 2, 3, 1));
        int target = 2;

        var out = problem.countPairs(nums, target);

        assertEquals(3, out);
    }

    @Test
    void example2() {
        /*
        Input: nums = [-6,2,5,-2,-7,-1,3], target = -2
        Output: 10
         */
        List<Integer> nums = new ArrayList<>(List.of(-6, 2, 5, -2, -7, -1, 3));
        int target = -2;

        var out = problem.countPairs(nums, target);

        assertEquals(10, out);
    }
}
