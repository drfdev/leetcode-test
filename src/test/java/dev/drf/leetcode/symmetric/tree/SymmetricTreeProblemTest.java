package dev.drf.leetcode.symmetric.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SymmetricTreeProblemTest {
    private final SymmetricTreeProblem problem = new SymmetricTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,2,2,3,4,4,3]
        Output: true
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(4)),
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(3)));

        boolean value = problem.isSymmetric(root);

        assertTrue(value);
    }

    @Test
    void example2() {
        /*
        Input: root = [1,2,2,null,3,null,3]
        Output: false
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        null,
                        new TreeNode(3)),
                new TreeNode(2,
                        null,
                        new TreeNode(3)));

        boolean value = problem.isSymmetric(root);

        assertFalse(value);
    }

    @Test
    void myTest1() {
        /*
        symmetric example2
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        null),
                new TreeNode(2,
                        null,
                        new TreeNode(3)));

        boolean value = problem.isSymmetric(root);

        assertTrue(value);
    }
}
