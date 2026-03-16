package dev.drf.leetcode.balance.a.binary.search.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BalanceABinarySearchTreeProblemTest {
    private final BalanceABinarySearchTreeProblem problem = new BalanceABinarySearchTreeProblem();

    @Test
    void example1() {
        // Input: root = [1,null,2,null,3,null,4,null,null]
        // Output: [2,1,3,null,null,null,4]
        var root = new TreeNode(1,
                null,
                new TreeNode(2,
                        null,
                        new TreeNode(3,
                                null,
                                new TreeNode(4))));

        var result = problem.balanceBST(root);

        assertEquals(2, result.val);
        assertEquals(1, result.left.val);
        assertEquals(3, result.right.val);
        assertEquals(4, result.right.right.val);
    }

    @Test
    void example2() {
        // Input: root = [2,1,3]
        // Output: [2,1,3]
        var root = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3));

        var result = problem.balanceBST(root);

        assertEquals(2, result.val);
        assertEquals(1, result.left.val);
        assertEquals(3, result.right.val);
    }
}
