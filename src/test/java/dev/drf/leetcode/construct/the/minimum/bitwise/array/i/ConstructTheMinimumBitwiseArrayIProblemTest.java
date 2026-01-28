package dev.drf.leetcode.construct.the.minimum.bitwise.array.i;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ConstructTheMinimumBitwiseArrayIProblemTest {
    private final ConstructTheMinimumBitwiseArrayIProblem problem = new ConstructTheMinimumBitwiseArrayIProblem();

    @Test
    void example1() {
        // Input: nums = [2,3,5,7]
        // Output: [-1,1,4,3]
        List<Integer> nums = List.of(2, 3, 5, 7);

        var ans = problem.minBitwiseArray(nums);

        int[] expected = {-1, 1, 4, 3};
        assertArrayEquals(expected, ans);
    }

    @Test
    void example2() {
        // Input: nums = [11,13,31]
        // Output: [9,12,15]
        List<Integer> nums = List.of(11, 13, 31);

        var ans = problem.minBitwiseArray(nums);

        int[] expected = {9, 12, 15};
        assertArrayEquals(expected, ans);
    }
}
