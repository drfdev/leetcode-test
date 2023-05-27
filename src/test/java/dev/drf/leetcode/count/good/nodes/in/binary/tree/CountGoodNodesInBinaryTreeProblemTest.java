package dev.drf.leetcode.count.good.nodes.in.binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountGoodNodesInBinaryTreeProblemTest {
    private final CountGoodNodesInBinaryTreeProblem problem = new CountGoodNodesInBinaryTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [3,1,4,3,null,1,5]
        Output: 4
         */
        TreeNode root = new TreeNode(3,
                new TreeNode(1,
                        new TreeNode(3),
                        null),
                new TreeNode(4,
                        new TreeNode(1),
                        new TreeNode(5)));

        var res = problem.goodNodes(root);

        assertEquals(4, res);
    }

    @Test
    void example2() {
        /*
        Input: root = [3,3,null,4,2]
        Output: 3
         */
        TreeNode root = new TreeNode(3,
                new TreeNode(3,
                        new TreeNode(4),
                        new TreeNode(2)),
                null);

        var res = problem.goodNodes(root);

        assertEquals(3, res);
    }

    @Test
    void example3() {
        /*
        Input: root = [1]
        Output: 1
         */
        TreeNode root = new TreeNode(1);

        var res = problem.goodNodes(root);

        assertEquals(1, res);
    }
}
