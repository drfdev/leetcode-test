package dev.drf.leetcode.smallest.subtree.with.all.the.deepest.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SmallestSubtreeWithAllTheDeepestNodesProblemTest {
    private final SmallestSubtreeWithAllTheDeepestNodesProblem problem = new SmallestSubtreeWithAllTheDeepestNodesProblem();

    @Test
    void example1() {
        // Input: root = [3,5,1,6,2,0,8,null,null,7,4]
        // Output: [2,7,4]
        TreeNode root = new TreeNode(3,
                new TreeNode(5,
                        new TreeNode(6),
                        new TreeNode(2,
                                new TreeNode(7),
                                new TreeNode(4))),
                new TreeNode(1,
                        new TreeNode(0),
                        new TreeNode(8)));

        var node = problem.subtreeWithAllDeepest(root);

        assertNotNull(node);
        assertEquals(2, node.val);
        assertEquals(7, node.left.val);
        assertEquals(4, node.right.val);
    }

    @Test
    void example2() {
        // Input: root = [1]
        // Output: [1]
        TreeNode root = new TreeNode(1);

        var node = problem.subtreeWithAllDeepest(root);

        assertNotNull(node);
        assertEquals(1, node.val);
    }

    @Test
    void example3() {
        // Input: root = [0,1,3,null,2]
        // Output: [2]
        TreeNode root = new TreeNode(0,
                new TreeNode(1,
                        null,
                        new TreeNode(2)),
                new TreeNode(3));

        var node = problem.subtreeWithAllDeepest(root);

        assertNotNull(node);
        assertEquals(2, node.val);
    }
}
