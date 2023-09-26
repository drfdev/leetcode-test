package dev.drf.leetcode.binary.tree.zigzag.level.order.traversal;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.contains;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BinaryTreeZigzagLevelOrderTraversalProblemTest {
    private final BinaryTreeZigzagLevelOrderTraversalProblem problem = new BinaryTreeZigzagLevelOrderTraversalProblem();

    @Test
    void example1() {
        /*
        Input: root = [3,9,20,null,null,15,7]
        Output: [[3],[20,9],[15,7]]
         */
        var root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20,
                        new TreeNode(15),
                        new TreeNode(7)));

        var list = problem.zigzagLevelOrder(root);

        assertThat(list, contains(
                contains(3),
                contains(20, 9),
                contains(15, 7)
        ));
    }

    @Test
    void example2() {
        /*
        Input: root = [1]
        Output: [[1]]
         */
        var root = new TreeNode(1);

        var list = problem.zigzagLevelOrder(root);

        assertThat(list, contains(
                contains(1)
        ));
    }

    @Test
    void example3() {
        /*
        Input: root = []
        Output: []
         */
        TreeNode root = null;

        var list = problem.zigzagLevelOrder(root);

        assertNotNull(list);
        assertTrue(list.isEmpty());
    }
}
