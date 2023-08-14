package dev.drf.leetcode.path.sum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PathSumProblemTest {
    private final PathSumProblem problem = new PathSumProblem();

    @Test
    void example1() {
        /*
        Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
        Output: true
         */
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)),
                        null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4,
                                null,
                                new TreeNode(1))));
        int targetSum = 22;

        var bool = problem.hasPathSum(root, targetSum);

        assertTrue(bool);
    }

    @Test
    void example2() {
        /*
        Input: root = [1,2,3], targetSum = 5
        Output: false
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        int targetSum = 5;

        var bool = problem.hasPathSum(root, targetSum);

        assertFalse(bool);
    }
}
