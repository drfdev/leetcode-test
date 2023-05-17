package dev.drf.leetcode.balanced.binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BalancedBinaryTreeProblemTest {
    private final BalancedBinaryTreeProblem problem = new BalancedBinaryTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [3,9,20,null,null,15,7]
        Output: true
         */
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));

        var res = problem.isBalanced(root);

        assertTrue(res);
    }

    @Test
    void example2() {
        /*
        Input: root = [1,2,2,3,3,null,null,4,4]
        Output: false
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3,
                                new TreeNode(4),
                                new TreeNode(4)),
                        new TreeNode(3)),
                new TreeNode(2));

        var res = problem.isBalanced(root);

        assertFalse(res);
    }

    @Test
    void example3() {
        /*
        Input: root = []
        Output: true
         */
        TreeNode root = null;

        var res = problem.isBalanced(root);

        assertTrue(res);
    }
}
