package dev.drf.leetcode.sum.of.values.at.indices.with.k.set.bits;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfValuesAtIndicesWithKSetBitsProblemTest {
    private final SumOfValuesAtIndicesWithKSetBitsProblem problem = new SumOfValuesAtIndicesWithKSetBitsProblem();

    @Test
    void example1() {
        // Input: nums = [5,10,1,5,2], k = 1
        // Output: 13
        List<Integer> nums = List.of(5, 10, 1, 5, 2);
        int k = 1;

        var res = problem.sumIndicesWithKSetBits(nums, k);

        assertEquals(13, res);
    }

    @Test
    void example2() {
        // Input: nums = [4,3,2,1], k = 2
        // Output: 1
        List<Integer> nums = List.of(4, 3, 2, 1);
        int k = 2;

        var res = problem.sumIndicesWithKSetBits(nums, k);

        assertEquals(1, res);
    }
}
