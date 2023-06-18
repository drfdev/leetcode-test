package dev.drf.leetcode.validate.binary.search.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidateBinarySearchTreeProblemTest {
    private final ValidateBinarySearchTreeProblem problem = new ValidateBinarySearchTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [2,1,3]
        Output: true
         */
        TreeNode root = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3));

        var valid = problem.isValidBST(root);

        assertTrue(valid);
    }

    @Test
    void example2() {
        /*
        Input: root = [5,1,4,null,null,3,6]
        Output: false
         */
        TreeNode root = new TreeNode(5,
                new TreeNode(1),
                new TreeNode(4,
                        new TreeNode(3),
                        new TreeNode(6)));

        var valid = problem.isValidBST(root);

        assertFalse(valid);
    }

    @Test
    void failed1() {
        // [5,4,6,null,null,3,7]
        // false
        TreeNode root = new TreeNode(5,
                new TreeNode(4),
                new TreeNode(6,
                        new TreeNode(3),
                        new TreeNode(7)));

        var valid = problem.isValidBST(root);

        assertFalse(valid);
    }
}
