package dev.drf.leetcode.root.equals.sum.of.children;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RootEqualsSumOfChildrenProblemTest {
    private final RootEqualsSumOfChildrenProblem problem = new RootEqualsSumOfChildrenProblem();

    @Test
    void example1() {
        /*
        Input: root = [10,4,6]
        Output: true
         */
        var root = new TreeNode(10,
                new TreeNode(4),
                new TreeNode(6));

        var bool = problem.checkTree(root);

        assertTrue(bool);
    }

    @Test
    void example2() {
        /*
        Input: root = [5,3,1]
        Output: false
         */
        var root = new TreeNode(5,
                new TreeNode(3),
                new TreeNode(1));

        var bool = problem.checkTree(root);

        assertFalse(bool);
    }
}
