package dev.drf.leetcode.count.complete.tree.nodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountCompleteTreeNodesProblemTest {
    private final CountCompleteTreeNodesProblem problem = new CountCompleteTreeNodesProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,2,3,4,5,6]
        Output: 6
         */
        var root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(4),
                        new TreeNode(5)),
                new TreeNode(3,
                        new TreeNode(6),
                        null));

        var num = problem.countNodes(root);

        assertEquals(6, num);
    }

    @Test
    void example2() {
        /*
        Input: root = []
        Output: 0
         */
        TreeNode root = null;

        var num = problem.countNodes(root);

        assertEquals(0, num);
    }

    @Test
    void example3() {
        /*
        Input: root = [1]
        Output: 1
         */
        var root = new TreeNode(1);

        var num = problem.countNodes(root);

        assertEquals(1, num);
    }
}
