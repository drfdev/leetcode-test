package dev.drf.leetcode.maximum.difference.between.node.and.ancestor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumDifferenceBetweenNodeAndAncestorProblemTest {
    private final MaximumDifferenceBetweenNodeAndAncestorProblem problem = new MaximumDifferenceBetweenNodeAndAncestorProblem();

    @Test
    void example1() {
        /*
        Input: root = [8,3,10,1,6,null,14,null,null,4,7,13]
        Output: 7
         */
        var root = new TreeNode(8,
                new TreeNode(3,
                        new TreeNode(1),
                        new TreeNode(6,
                                new TreeNode(4),
                                new TreeNode(7))),
                new TreeNode(10,
                        null,
                        new TreeNode(14,
                                new TreeNode(13),
                                null)));

        var out = problem.maxAncestorDiff(root);

        assertEquals(7, out);
    }

    @Test
    void example2() {
        /*
        Input: root = [1,null,2,null,0,3]
        Output: 3
         */
        var root = new TreeNode(1,
                null,
                new TreeNode(2,
                        null,
                        new TreeNode(0,
                                new TreeNode(3),
                                null)));

        var out = problem.maxAncestorDiff(root);

        assertEquals(3, out);
    }
}
