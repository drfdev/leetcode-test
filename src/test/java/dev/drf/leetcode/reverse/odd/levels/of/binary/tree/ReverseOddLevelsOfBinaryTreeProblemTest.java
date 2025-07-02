package dev.drf.leetcode.reverse.odd.levels.of.binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseOddLevelsOfBinaryTreeProblemTest {
    private ReverseOddLevelsOfBinaryTreeProblem problem = new ReverseOddLevelsOfBinaryTreeProblem();

    @Test
    void example1() {
        // Input: root = [2,3,5,8,13,21,34]
        // Output: [2,5,3,8,13,21,34]
        TreeNode root = new TreeNode(2,
                new TreeNode(3,
                        new TreeNode(8),
                        new TreeNode(13)),
                new TreeNode(5,
                        new TreeNode(21),
                        new TreeNode(34)));

        var out = problem.reverseOddLevels(root);

        assertEquals(2, out.val);
        assertEquals(5, out.left.val);
        assertEquals(8, out.left.left.val);
        assertEquals(13, out.left.right.val);
        assertEquals(3, out.right.val);
        assertEquals(21, out.right.left.val);
        assertEquals(34, out.right.right.val);
    }

    @Test
    void example2() {
        // Input: root = [7,13,11]
        // Output: [7,11,13]
        TreeNode root = new TreeNode(7,
                new TreeNode(13),
                new TreeNode(11));

        var out = problem.reverseOddLevels(root);

        assertEquals(7, out.val);
        assertEquals(11, out.left.val);
        assertEquals(13, out.right.val);
    }

    @Test
    void example3() {
        // Input: root = [0,1,2,0,0,0,0,1,1,1,1,2,2,2,2]
        // Output: [0,2,1,0,0,0,0,2,2,2,2,1,1,1,1]
        TreeNode root = new TreeNode(0,
                new TreeNode(1,
                        new TreeNode(0,
                                new TreeNode(1),
                                new TreeNode(1)),
                        new TreeNode(0,
                                new TreeNode(1),
                                new TreeNode(1))),
                new TreeNode(2,
                        new TreeNode(0,
                                new TreeNode(2),
                                new TreeNode(2)),
                        new TreeNode(0,
                                new TreeNode(2),
                                new TreeNode(2))));

        var out = problem.reverseOddLevels(root);

        assertEquals(0, out.val);
        assertEquals(2, out.left.val);
        assertEquals(0, out.left.left.val);
        assertEquals(2, out.left.left.left.val);
        assertEquals(2, out.left.left.right.val);
        assertEquals(0, out.left.right.val);
        assertEquals(2, out.left.right.left.val);
        assertEquals(2, out.left.right.right.val);
        assertEquals(1, out.right.val);
        assertEquals(0, out.right.left.val);
        assertEquals(1, out.right.left.left.val);
        assertEquals(1, out.right.left.right.val);
        assertEquals(0, out.right.right.val);
        assertEquals(1, out.right.right.left.val);
        assertEquals(1, out.right.right.right.val);
    }
}
