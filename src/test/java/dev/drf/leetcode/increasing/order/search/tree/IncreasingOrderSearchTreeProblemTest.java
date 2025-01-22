package dev.drf.leetcode.increasing.order.search.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncreasingOrderSearchTreeProblemTest {
    private final IncreasingOrderSearchTreeProblem problem = new IncreasingOrderSearchTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
        Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
         */
        TreeNode root = new TreeNode(5,
                new TreeNode(3,
                        new TreeNode(2,
                                new TreeNode(1),
                                null),
                        new TreeNode(4)),
                new TreeNode(6,
                        null,
                        new TreeNode(8,
                                new TreeNode(7),
                                new TreeNode(9))));

        var result = problem.increasingBST(root);

        assertEquals(1, result.val);
        assertEquals(2, result.right.val);
        assertEquals(3, result.right.right.val);
        assertEquals(4, result.right.right.right.val);
        assertEquals(5, result.right.right.right.right.val);
        assertEquals(6, result.right.right.right.right.right.val);
        assertEquals(7, result.right.right.right.right.right.right.val);
        assertEquals(8, result.right.right.right.right.right.right.right.val);
        assertEquals(9, result.right.right.right.right.right.right.right.right.val);
    }

    @Test
    void example2() {
        /*
        Input: root = [5,1,7]
        Output: [1,null,5,null,7]
         */
        TreeNode root = new TreeNode(5,
                new TreeNode(1),
                new TreeNode(7));

        var result = problem.increasingBST(root);

        assertEquals(1, result.val);
        assertEquals(5, result.right.val);
        assertEquals(7, result.right.right.val);
    }
}
