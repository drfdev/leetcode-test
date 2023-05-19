package dev.drf.leetcode.product.of.array.except.self;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductOfArrayExceptSelfProblemTest {
    private final ProductOfArrayExceptSelfProblem problem = new ProductOfArrayExceptSelfProblem();

    private void assertArray(int[] result, int... values) {
        assertEquals(values.length, result.length);

        for (int i = 0; i < values.length; i++) {
            assertEquals(values[i], result[i]);
        }
    }

    @Test
    void example1() {
        /*
        Input: nums = [1,2,3,4]
        Output: [24,12,8,6]
         */
        int[] nums = new int[]{1, 2, 3, 4};

        var result = problem.productExceptSelf(nums);

        assertArray(result, 24, 12, 8, 6);
    }

    @Test
    void example2() {
        /*
        Input: nums = [-1,1,0,-3,3]
        Output: [0,0,9,0,0]
         */
        int[] nums = new int[]{-1, 1, 0, -3, 3};

        var result = problem.productExceptSelf(nums);

        assertArray(result, 0, 0, 9, 0, 0);
    }

    @Test
    void myTest1() {
        int[] nums = new int[]{-1, 1, -2, 2};

        var result = problem.productExceptSelf(nums);

        assertArray(result, -4, 4, -2, 2);
    }

    @Test
    void myTest2() {
        int[] nums = new int[]{0, 0, 0, 0};

        var result = problem.productExceptSelf(nums);

        assertArray(result, 0, 0, 0, 0);
    }

    @Test
    void myTest3() {
        int[] nums = new int[]{1, 1, -1, -1};

        var result = problem.productExceptSelf(nums);

        assertArray(result, 1, 1, -1, -1);
    }

    @Test
    void failed1() {
        /*
        nums = [0,4,0]
        [0,0,0]
         */
        int[] nums = new int[]{0, 4, 0};

        var result = problem.productExceptSelf(nums);

        assertArray(result, 0, 0, 0);
    }
}
