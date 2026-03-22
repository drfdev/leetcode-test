package dev.drf.leetcode.merge.two.binary.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MergeTwoBinaryTreesProblemTest {
    private final MergeTwoBinaryTreesProblem problem = new MergeTwoBinaryTreesProblem();

    @Test
    void example1() {
        // Input: root1 = [1,3,2,5], root2 = [2,1,3,null,4,null,7]
        // Output: [3,4,5,5,4,null,7]
        TreeNode root1 = new TreeNode(1,
                new TreeNode(3,
                        new TreeNode(5),
                        null),
                new TreeNode(2));
        TreeNode root2 = new TreeNode(2,
                new TreeNode(1,
                        null,
                        new TreeNode(4)),
                new TreeNode(3,
                        null,
                        new TreeNode(7)));

        var root = problem.mergeTrees(root1, root2);

        assertNotNull(root);
        assertEquals(3, root.val);
        assertEquals(4, root.left.val);
        assertEquals(5, root.left.left.val);
        assertEquals(4, root.left.right.val);
        assertEquals(5, root.right.val);
        assertEquals(7, root.right.right.val);
    }

    @Test
    void example2() {
        // Input: root1 = [1], root2 = [1,2]
        // Output: [2,2]
        TreeNode root1 = new TreeNode(1);
        TreeNode root2 = new TreeNode(1,
                new TreeNode(2),
                null);

        var root = problem.mergeTrees(root1, root2);

        assertNotNull(root);
        assertEquals(2, root.val);
        assertEquals(2, root.left.val);
    }
}
