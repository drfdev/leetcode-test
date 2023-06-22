package dev.drf.leetcode.binary.tree.level.order.traversal;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryTreeLevelOrderTraversalProblemTest {
    private final BinaryTreeLevelOrderTraversalProblem problem = new BinaryTreeLevelOrderTraversalProblem();

    @Test
    void example1() {
        /*
        Input: root = [3,9,20,null,null,15,7]
        Output: [[3],[9,20],[15,7]]
         */
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));

        var levels = problem.levelOrder(root);

        assertThat(levels, contains(
                containsInAnyOrder(3),
                containsInAnyOrder(9, 20),
                containsInAnyOrder(15, 7)
        ));
    }

    @Test
    void example2() {
        /*
        Input: root = [1]
        Output: [[1]]
         */
        TreeNode root = new TreeNode(1);

        var levels = problem.levelOrder(root);

        assertThat(levels, contains(
                containsInAnyOrder(1)
        ));
    }

    @Test
    void example3() {
        /*
        Input: root = []
        Output: []
         */
        TreeNode root = null;

        var levels = problem.levelOrder(root);

        assertTrue(levels.isEmpty());
    }
}
