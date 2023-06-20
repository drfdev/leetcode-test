package dev.drf.leetcode.diameter.of.binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiameterOfBinaryTreeProblemTest {
    private final DiameterOfBinaryTreeProblem problem = new DiameterOfBinaryTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,2,3,4,5]
        Output: 3
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3));

        var res = problem.diameterOfBinaryTree(root);

        assertEquals(3, res);
    }

    @Test
    void example2() {
        /*
        Input: root = [1,2]
        Output: 1
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                null);

        var res = problem.diameterOfBinaryTree(root);

        assertEquals(1, res);
    }
}
