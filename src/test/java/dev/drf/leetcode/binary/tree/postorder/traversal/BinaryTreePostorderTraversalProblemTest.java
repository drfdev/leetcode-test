package dev.drf.leetcode.binary.tree.postorder.traversal;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreePostorderTraversalProblemTest {
    private final BinaryTreePostorderTraversalProblem problem = new BinaryTreePostorderTraversalProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,null,2,3]
        Output: [3,2,1]
         */
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2,
                        new TreeNode(3),
                        null));

        var tr = problem.postorderTraversal(root);

        var expected = List.of(3, 2, 1);
        assertEquals(expected, tr);
    }

    @Test
    void example2() {
        /*
        Input: root = [1,2,3,4,5,null,8,null,null,6,7,9]
        Output: [4,6,7,5,2,9,8,3,1]
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

        var tr = problem.postorderTraversal(root);

        var expected = List.of(4, 6, 7, 5, 2, 9, 8, 3, 1);
        assertEquals(expected, tr);
    }

    @Test
    void example3() {
        /*
        Input: root = []
        Output: []
         */
        TreeNode root = null;

        var tr = problem.postorderTraversal(root);

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

        var tr = problem.postorderTraversal(root);

        var expected = List.of(1);
        assertEquals(expected, tr);
    }
}
