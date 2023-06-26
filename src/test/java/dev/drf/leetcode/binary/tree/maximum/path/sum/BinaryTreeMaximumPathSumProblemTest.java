package dev.drf.leetcode.binary.tree.maximum.path.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeMaximumPathSumProblemTest {
    private final BinaryTreeMaximumPathSumProblem problem = new BinaryTreeMaximumPathSumProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,2,3]
        Output: 6
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));

        var output = problem.maxPathSum(root);

        assertEquals(6, output);
    }

    @Test
    void example2() {
        /*
        Input: root = [-10,9,20,null,null,15,7]
        Output: 42
         */
        TreeNode root = new TreeNode(-10,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));

        var output = problem.maxPathSum(root);

        assertEquals(42, output);
    }
}
