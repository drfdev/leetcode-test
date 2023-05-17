package dev.drf.leetcode.binary.tree.inorder.traversal;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class BinaryTreeInorderTraversalProblemTest {
    private final BinaryTreeInorderTraversalProblem problem = new BinaryTreeInorderTraversalProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,null,2,3]
        Output: [1,3,2]
         */
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(2,
                        new TreeNode(3),
                        null));

        var list = problem.inorderTraversal(root);

        assertThat(list, contains(
                1, 3, 2
        ));
    }

    @Test
    void example2() {
        /*
        Input: root = []
        Output: []
         */
        TreeNode root = null;

        var list = problem.inorderTraversal(root);

        assertNotNull(list);
        assertEquals(0, list.size());
    }

    @Test
    void example3() {
        /*
        Input: root = [1]
        Output: [1]
         */
        TreeNode root = new TreeNode(1);

        var list = problem.inorderTraversal(root);

        assertThat(list, contains(
                1
        ));
    }
}
