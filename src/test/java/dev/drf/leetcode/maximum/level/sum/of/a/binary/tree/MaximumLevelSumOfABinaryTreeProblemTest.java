package dev.drf.leetcode.maximum.level.sum.of.a.binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumLevelSumOfABinaryTreeProblemTest {
    private final MaximumLevelSumOfABinaryTreeProblem problem = new MaximumLevelSumOfABinaryTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,7,0,7,-8,null,null]
        Output: 2
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(7,
                        new TreeNode(7),
                        new TreeNode(-8)),
                new TreeNode(0));

        var level = problem.maxLevelSum(root);

        assertEquals(2, level);
    }

    @Test
    void example2() {
        /*
        Input: root = [989,null,10250,98693,-89388,null,null,null,-32127]
        Output: 2
         */
        TreeNode root = new TreeNode(989,
                null,
                new TreeNode(10250,
                        new TreeNode(98693),
                        new TreeNode(-89388,
                                null,
                                new TreeNode(-32127))));

        var level = problem.maxLevelSum(root);

        assertEquals(2, level);
    }
}
