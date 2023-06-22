package dev.drf.leetcode.kth.smallest.element.in.a.bst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthSmallestElementInABstProblemTest {
    private final KthSmallestElementInABstProblem2 problem = new KthSmallestElementInABstProblem2();

    @Test
    void example1() {
        /*
        Input: root = [3,1,4,null,2], k = 1
        Output: 1
         */
        TreeNode root = new TreeNode(3,
                new TreeNode(1,
                        null,
                        new TreeNode(2)),
                new TreeNode(4));
        int k = 1;

        var min = problem.kthSmallest(root, k);

        assertEquals(1, min);
    }

    @Test
    void example2() {
        /*
        Input: root = [5,3,6,2,4,null,null,1], k = 3
        Output: 3
         */
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2,
                                new TreeNode(1),
                                null),
                        new TreeNode(4)),
                new TreeNode(6));
        int k = 3;

        var min = problem.kthSmallest(root, k);

        assertEquals(3, min);
    }
}
