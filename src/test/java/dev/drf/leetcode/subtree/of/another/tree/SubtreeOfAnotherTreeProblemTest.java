package dev.drf.leetcode.subtree.of.another.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SubtreeOfAnotherTreeProblemTest {
    private final SubtreeOfAnotherTreeProblem problem = new SubtreeOfAnotherTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [3,4,5,1,2], subRoot = [4,1,2]
        Output: true
         */
        TreeNode root = new TreeNode(3,
                new TreeNode(4,
                        new TreeNode(1),
                        new TreeNode(2)),
                new TreeNode(5));
        TreeNode subRoot = new TreeNode(4,
                new TreeNode(1),
                new TreeNode(2));

        var result = problem.isSubtree(root, subRoot);

        assertTrue(result);
    }

    @Test
    void example2() {
        /*
        Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
        Output: false
         */
        TreeNode root = new TreeNode(3,
                new TreeNode(4,
                        new TreeNode(1),
                        new TreeNode(2,
                                new TreeNode(0),
                                null)),
                new TreeNode(5));
        TreeNode subRoot = new TreeNode(4,
                new TreeNode(1),
                new TreeNode(2));

        var result = problem.isSubtree(root, subRoot);

        assertFalse(result);
    }

    @Test
    void failed1() {
        // wtf?
        TreeNode root = new TreeNode(1,
                new TreeNode(1),
                null);
        TreeNode subRoot = new TreeNode(1);

        var result = problem.isSubtree(root, subRoot);

        assertTrue(result);
    }
}
