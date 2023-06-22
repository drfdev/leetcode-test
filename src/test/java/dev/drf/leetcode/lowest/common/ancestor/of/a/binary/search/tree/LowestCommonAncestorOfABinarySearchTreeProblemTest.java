package dev.drf.leetcode.lowest.common.ancestor.of.a.binary.search.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

public class LowestCommonAncestorOfABinarySearchTreeProblemTest {
    private final LowestCommonAncestorOfABinarySearchTreeProblem problem = new LowestCommonAncestorOfABinarySearchTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
        Output: 6
         */
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        TreeNode p = root.left;
        TreeNode q = root.right;

        var node = problem.lowestCommonAncestor(root, p, q);

        assertSame(root, node);
    }

    @Test
    void example2() {
        /*
        Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
        Output: 2
         */
        TreeNode root = new TreeNode(6);
        root.left = new TreeNode(2);
        root.right = new TreeNode(8);

        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);

        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);

        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        TreeNode p = root.left;
        TreeNode q = root.left.right;

        var node = problem.lowestCommonAncestor(root, p, q);

        assertSame(root.left, node);
    }

    @Test
    void example3() {
        /*
        Input: root = [2,1], p = 2, q = 1
        Output: 2
         */
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);

        TreeNode p = root.left;
        TreeNode q = root;

        var node = problem.lowestCommonAncestor(root, p, q);

        assertSame(root, node);
    }
}
