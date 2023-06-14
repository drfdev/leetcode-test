package dev.drf.leetcode.minimum.absolute.difference.in.bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumAbsoluteDifferenceInBstProblemTest {
    private final MinimumAbsoluteDifferenceInBstProblem problem = new MinimumAbsoluteDifferenceInBstProblem();

    @Test
    void example1() {
        /*
        Input: root = [4,2,6,1,3]
        Output: 1
         */
        TreeNode root = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(6));

        int val = problem.getMinimumDifference(root);

        assertEquals(1, val);
    }

    @Test
    void example2() {
        /*
        Input: root = [1,0,48,null,null,12,49]
        Output: 1
         */
        TreeNode root = new TreeNode(1,
                new TreeNode(0),
                new TreeNode(48,
                        new TreeNode(12),
                        new TreeNode(49)));

        int val = problem.getMinimumDifference(root);

        assertEquals(1, val);
    }

    @Test
    void failed1() {
        /*
        [236,104,701,null,227,null,911]
         */
        TreeNode root = new TreeNode(236,
                new TreeNode(104,
                        null,
                        new TreeNode(227)),
                new TreeNode(701,
                        null,
                        new TreeNode(911)));

        int val = problem.getMinimumDifference(root);

        assertEquals(9, val);
    }
}
