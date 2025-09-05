package dev.drf.leetcode.maximum.binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumBinaryTreeProblemTest {
    private final MaximumBinaryTreeProblem problem = new MaximumBinaryTreeProblem();

    @Test
    void example1() {
        // Input: nums = [3,2,1,6,0,5]
        // Output: [6,3,5,null,2,0,null,null,1]
        int[] nums = {3, 2, 1, 6, 0, 5};

        var tree = problem.constructMaximumBinaryTree(nums);

        assertEquals(6, tree.val);
        assertEquals(3, tree.left.val);
        assertEquals(2, tree.left.right.val);
        assertEquals(1, tree.left.right.right.val);
        assertEquals(5, tree.right.val);
        assertEquals(0, tree.right.left.val);
    }

    @Test
    void example2() {
        // Input: nums = [3,2,1]
        // Output: [3,null,2,null,1]
        int[] nums = {3, 2, 1};

        var tree = problem.constructMaximumBinaryTree(nums);

        assertEquals(3, tree.val);
        assertEquals(2, tree.right.val);
        assertEquals(1, tree.right.right.val);
    }
}
