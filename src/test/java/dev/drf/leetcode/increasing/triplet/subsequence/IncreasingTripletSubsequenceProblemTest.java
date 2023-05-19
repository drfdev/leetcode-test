package dev.drf.leetcode.increasing.triplet.subsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IncreasingTripletSubsequenceProblemTest {
    private final IncreasingTripletSubsequenceProblem problem = new IncreasingTripletSubsequenceProblem();

    @Test
    void example1() {
        /*
        Input: nums = [1,2,3,4,5]
        Output: true
         */
        int[] nums = new int[]{1, 2, 3, 4, 5};

        var correct = problem.increasingTriplet(nums);

        assertTrue(correct);
    }

    @Test
    void example2() {
        /*
        Input: nums = [5,4,3,2,1]
        Output: false
         */
        int[] nums = new int[]{5, 4, 3, 2, 1};

        var correct = problem.increasingTriplet(nums);

        assertFalse(correct);
    }

    @Test
    void example3() {
        /*
        Input: nums = [2,1,5,0,4,6]
        Output: true
         */
        int[] nums = new int[]{2, 1, 5, 0, 4, 6};

        var correct = problem.increasingTriplet(nums);

        assertTrue(correct);
    }

    @Test
    void myTest1() {
        int[] nums = new int[]{1, 1, 1, 1, 1, 1};

        var correct = problem.increasingTriplet(nums);

        assertFalse(correct);
    }

    @Test
    void myTest2() {
        int[] nums = new int[]{5, 4, 5, 4, 6, 2};

        var correct = problem.increasingTriplet(nums);

        assertTrue(correct);
    }

    @Test
    void myTest3() {
        int[] nums = new int[]{5, 4, 5, 1, 2, 3};

        var correct = problem.increasingTriplet(nums);

        assertTrue(correct);
    }

    @Test
    void failed1() {
        int[] nums = new int[]{1, 5, 0, 4, 1, 3};

        var correct = problem.increasingTriplet(nums);

        assertTrue(correct);
    }
}
