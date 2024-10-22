package dev.drf.leetcode.kth.largest.sum.in.a.binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthLargestSumInABinaryTreeProblemTest {
    private final KthLargestSumInABinaryTreeProblem problem = new KthLargestSumInABinaryTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [5,8,9,2,1,3,7,4,6], k = 2
        Output: 13
         */
        int k = 2;
        TreeNode root = new TreeNode(5,
                new TreeNode(8,
                        new TreeNode(2,
                                new TreeNode(4),
                                new TreeNode(6)),
                        new TreeNode(1)),
                new TreeNode(9,
                        new TreeNode(3),
                        new TreeNode(7)));

        var out = problem.kthLargestLevelSum(root, k);

        assertEquals(13L, out);
    }

    @Test
    void example2() {
        /*
        Input: root = [1,2,null,3], k = 1
        Output: 3
         */
        int k = 1;
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        null),
                null);

        var out = problem.kthLargestLevelSum(root, k);

        assertEquals(3L, out);
    }
}
