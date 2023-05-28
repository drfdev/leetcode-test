package dev.drf.leetcode.longest.zigzag.path.in.a.binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestZigzagPathInABinaryTreeProblemTest {
    private final LongestZigzagPathInABinaryTreeProblem problem = new LongestZigzagPathInABinaryTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [1,null,1,1,1,null,null,1,1,null,1,null,null,null,1]
        Output: 3
         */
        TreeNode root = new TreeNode(0,
                null,
                new TreeNode(1,
                        new TreeNode(2),
                        new TreeNode(3,
                                new TreeNode(4,
                                        null,
                                        new TreeNode(6,
                                                null,
                                                new TreeNode(7))),
                                new TreeNode(5))));

        var res = problem.longestZigZag(root);

        assertEquals(3, res);
    }

    @Test
    void example2() {
        /*
        Input: root = [1,1,1,null,1,null,null,1,1,null,1]
        Output: 4
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(1,
                        null,
                        new TreeNode(1,
                                new TreeNode(1,
                                        null,
                                        new TreeNode(1)),
                                new TreeNode(1))),
                new TreeNode(1));

        var res = problem.longestZigZag(root);

        assertEquals(4, res);
    }

    @Test
    void myExample1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2),
                new TreeNode(3));

        var res = problem.longestZigZag(root);

        assertEquals(1, res);
    }

    @Test
    void myExample2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        null,
                        new TreeNode(3)),
                null);

        var res = problem.longestZigZag(root);

        assertEquals(2, res);
    }

    @Test
    void example3() {
        /*
        Input: root = [1]
        Output: 0
         */
        TreeNode root = new TreeNode(1);

        var res = problem.longestZigZag(root);

        assertEquals(0, res);
    }

    @Test
    void failed1() {
        /*
        [1,1,1,1,1,1,1,null,null,null,null,null,null,1,1,null,null,1]
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(1,
                        new TreeNode(1),
                        new TreeNode(2)),
                new TreeNode(2,
                        new TreeNode(10),
                        new TreeNode(20,
                                new TreeNode(11),
                                new TreeNode(22,
                                        new TreeNode(17),
                                        null))));

        var res = problem.longestZigZag(root);

        assertEquals(2, res);
    }
}
