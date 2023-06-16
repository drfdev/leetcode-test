package dev.drf.leetcode.invert.binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class InvertBinaryTreeProblemTest {
    private final InvertBinaryTreeProblem problem = new InvertBinaryTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [4,2,7,1,3,6,9]
        Output: [4,7,2,9,6,3,1]
         */
        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6),
                        new TreeNode(9)));

        var res = problem.invertTree(root);

        assertEquals(4, res.val);

        assertEquals(7, res.left.val);
        assertEquals(2, res.right.val);

        assertEquals(9, res.left.left.val);
        assertEquals(6, res.left.right.val);

        assertEquals(3, res.right.left.val);
        assertEquals(1, res.right.right.val);
    }

    @Test
    void example2() {
        /*
        Input: root = [2,1,3]
        Output: [2,3,1]
         */
        TreeNode root = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3));

        var res = problem.invertTree(root);

        assertEquals(2, res.val);

        assertEquals(3, res.left.val);
        assertEquals(1, res.right.val);
    }

    @Test
    void example3() {
        /*
        Input: root = []
        Output: []
         */
        TreeNode root = null;

        var res = problem.invertTree(root);

        assertNull(res);
    }
}
