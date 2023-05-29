package dev.drf.leetcode.search.in.a.binary.search.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;

public class SearchInABinarySearchTreeProblemTest {
    private final SearchInABinarySearchTreeProblem problem = new SearchInABinarySearchTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [4,2,7,1,3], val = 2
        Output: [2,1,3]
         */
        TreeNode res = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3));
        TreeNode root = new TreeNode(4,
                res,
                new TreeNode(7));
        int val = 2;

        var result = problem.searchBST(root, val);

        assertSame(res, result);
    }

    @Test
    void example2() {
        /*
        Input: root = [4,2,7,1,3], val = 5
        Output: []
         */
        TreeNode res = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3));
        TreeNode root = new TreeNode(4,
                res,
                new TreeNode(7));
        int val = 5;

        var result = problem.searchBST(root, val);

        assertNull(result);
    }
}
