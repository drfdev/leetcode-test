package dev.drf.leetcode.flatten.binary.tree.to.linked.list;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class FlattenBinaryTreeToLinkedListProblemTest {
    private final FlattenBinaryTreeToLinkedListProblem problem = new FlattenBinaryTreeToLinkedListProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,2,5,3,4,null,6]
        Output: [1,null,2,null,3,null,4,null,5,null,6]
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(4)),
                new TreeNode(5,
                        null,
                        new TreeNode(6)));

        problem.flatten(root);

        assertEquals(1, root.val);
        assertEquals(2, root.right.val);
        assertEquals(3, root.right.right.val);
        assertEquals(4, root.right.right.right.val);
        assertEquals(5, root.right.right.right.right.val);
        assertEquals(6, root.right.right.right.right.right.val);
    }

    @Test
    void example2() {
        /*
        Input: root = []
        Output: []
         */
        TreeNode root = null;

        problem.flatten(root);

        assertNull(root);
    }

    @Test
    void example3() {
        /*
        Input: root = [0]
        Output: [0]
         */
        TreeNode root = new TreeNode(0);

        problem.flatten(root);

        assertEquals(0, root.val);
    }
}
