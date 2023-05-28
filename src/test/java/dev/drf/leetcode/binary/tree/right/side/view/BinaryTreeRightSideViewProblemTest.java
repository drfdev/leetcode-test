package dev.drf.leetcode.binary.tree.right.side.view;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreeRightSideViewProblemTest {
    private final BinaryTreeRightSideViewProblem problem = new BinaryTreeRightSideViewProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,2,3,null,5,null,4]
        Output: [1,3,4]
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        null,
                        new TreeNode(5)),
                new TreeNode(3,
                        null,
                        new TreeNode(4)));

        var list = problem.rightSideView(root);

        assertEquals(3, list.size());

        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
        assertEquals(4, list.get(2));
    }

    @Test
    void example2() {
        /*
        Input: root = [1,null,3]
        Output: [1,3]
         */
        TreeNode root = new TreeNode(1,
                null,
                new TreeNode(3));

        var list = problem.rightSideView(root);

        assertEquals(2, list.size());

        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
    }

    @Test
    void example3() {
        /*
        Input: root = []
        Output: []
         */
        TreeNode root = null;

        var list = problem.rightSideView(root);

        assertEquals(0, list.size());
    }

    @Test
    void failed1() {
        /*
        [1,2,3,4]
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        null,
                        new TreeNode(4)),
                new TreeNode(3));

        var list = problem.rightSideView(root);

        assertEquals(3, list.size());

        assertEquals(1, list.get(0));
        assertEquals(3, list.get(1));
        assertEquals(4, list.get(2));
    }
}
