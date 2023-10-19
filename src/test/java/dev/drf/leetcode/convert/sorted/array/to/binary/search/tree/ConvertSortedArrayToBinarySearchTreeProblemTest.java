package dev.drf.leetcode.convert.sorted.array.to.binary.search.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConvertSortedArrayToBinarySearchTreeProblemTest {
    private final ConvertSortedArrayToBinarySearchTreeProblem problem = new ConvertSortedArrayToBinarySearchTreeProblem();

    @Test
    void example1() {
        /*
        Input: nums = [-10,-3,0,5,9]
        Output: [0,-3,9,-10,null,5]
         */
        int[] nums = new int[]{
                -10, -3, 0, 5, 9
        };

        var tree = problem.sortedArrayToBST(nums);

        assertEquals(0, tree.val);
        assertEquals(-10, tree.left.val);
        assertEquals(-3, tree.left.right.val);
        assertEquals(5, tree.right.val);
        assertEquals(9, tree.right.right.val);
    }

    @Test
    void example2() {
        /*
        Input: nums = [1,3]
        Output: [3,1]
         */
        int[] nums = new int[]{
                1,3
        };

        var tree = problem.sortedArrayToBST(nums);

        assertEquals(1, tree.val);
        assertEquals(3, tree.right.val);
    }
}
