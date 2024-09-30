package dev.drf.leetcode.binary.tree.preorder.traversal;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreePreorderTraversalProblemTest {
    private final BinaryTreePreorderTraversalProblem problem = new BinaryTreePreorderTraversalProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,null,2,3]
        Output: [1,2,3]
         */
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2,
                        new TreeNode(3),
                        null));

        var tr = problem.preorderTraversal(root);

        var expected = List.of(1, 2, 3);
        assertEquals(expected, tr);
    }

    @Test
    void example2() {
        /*
        Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
        Output: [1,2,4,5,6,7,3,8,9]
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5,
                                new TreeNode(6),
                                new TreeNode(7))),
                new TreeNode(3,
                        null,
                        new TreeNode(8,
                                new TreeNode(9),
                                null)));

        var tr = problem.preorderTraversal(root);

        var expected = List.of(1, 2, 4, 5, 6, 7, 3, 8, 9);
        assertEquals(expected, tr);
    }

    @Test
    void example3() {
        /*
        Input: root = []
        Output: []
         */
        TreeNode root = null;

        var tr = problem.preorderTraversal(root);

        var expected = List.of();
        assertEquals(expected, tr);
    }

    @Test
    void example4() {
        /*
        Input: root = [1]
        Output: [1]
         */
        TreeNode root = new TreeNode(1);

        var tr = problem.preorderTraversal(root);

        var expected = List.of(1);
        assertEquals(expected, tr);
    }
}
