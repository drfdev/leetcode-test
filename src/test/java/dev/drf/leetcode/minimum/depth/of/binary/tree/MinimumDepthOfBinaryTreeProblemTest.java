package dev.drf.leetcode.minimum.depth.of.binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDepthOfBinaryTreeProblemTest {
    private final MinimumDepthOfBinaryTreeProblem problem = new MinimumDepthOfBinaryTreeProblem();

    @Test
    void example1() {
        // Input: root = [3,9,20,null,null,15,7]
        // Output: 2
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));

        int depth = problem.minDepth(root);

        assertEquals(2, depth);
    }

    @Test
    void example2() {
        // Input: root = [2,null,3,null,4,null,5,null,6]
        // Output: 5
        TreeNode root = new TreeNode(2,
                null,
                new TreeNode(3,
                        null,
                        new TreeNode(4,
                                null,
                                new TreeNode(5,
                                        null,
                                        new TreeNode(6)))));

        int depth = problem.minDepth(root);

        assertEquals(5, depth);
    }
}
