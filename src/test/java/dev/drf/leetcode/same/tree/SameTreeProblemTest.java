package dev.drf.leetcode.same.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SameTreeProblemTest {
    private final SameTreeProblem problem = new SameTreeProblem();

    @Test
    void example1() {
        /*
        Input: p = [1,2,3], q = [1,2,3]
        Output: true
         */
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));
        TreeNode q = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));

        var res = problem.isSameTree(p, q);

        assertTrue(res);
    }

    @Test
    void example2() {
        /*
        Input: p = [1,2], q = [1,null,2]
        Output: false
         */
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                null);
        TreeNode q = new TreeNode(1,
                null,
                new TreeNode(2));

        var res = problem.isSameTree(p, q);

        assertFalse(res);
    }

    @Test
    void example3() {
        /*
        Input: p = [1,2,1], q = [1,1,2]
        Output: false
         */
        TreeNode p = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(1));
        TreeNode q = new TreeNode(1,
                new TreeNode(1),
                new TreeNode(2));

        var res = problem.isSameTree(p, q);

        assertFalse(res);
    }
}
