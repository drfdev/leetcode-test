package dev.drf.leetcode.maximum.depth.of.binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDepthOfBinaryTreeProblemTest {
    private final MaximumDepthOfBinaryTreeProblem problem = new MaximumDepthOfBinaryTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [3,9,20,null,null,15,7]
        Output: 3
         */
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));

        int value = problem.maxDepth(root);

        assertEquals(3, value);
    }

    @Test
    void example2() {
        /*
        Input: root = [1,null,2]
        Output: 2
         */
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2));

        int value = problem.maxDepth(root);

        assertEquals(2, value);
    }
}
