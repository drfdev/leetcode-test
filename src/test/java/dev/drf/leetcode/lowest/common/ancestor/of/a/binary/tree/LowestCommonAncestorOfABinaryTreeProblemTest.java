package dev.drf.leetcode.lowest.common.ancestor.of.a.binary.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LowestCommonAncestorOfABinaryTreeProblemTest {
    private final LowestCommonAncestorOfABinaryTreeProblem problem = new LowestCommonAncestorOfABinaryTreeProblem();

    @Test
    void example1() {
        /*
        Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
        Output: 3
         */
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);
        TreeNode root = new TreeNode(3);
        root.left = p;
        root.right = q;

        TreeNode pl = new TreeNode(6);
        TreeNode pr = new TreeNode(2);
        p.left = pl;
        p.right = pr;

        TreeNode prl = new TreeNode(7);
        TreeNode prr = new TreeNode(4);
        pr.left = prl;
        pr.right = prr;

        TreeNode ql = new TreeNode(0);
        TreeNode qr = new TreeNode(8);
        q.left = ql;
        q.right = qr;

        var node = problem.lowestCommonAncestor(root, p, q);

        assertNotNull(node);
        assertEquals(3, node.val);
    }

    @Test
    void example2() {
        /*
        Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4
        Output: 5
         */
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);
        TreeNode root = new TreeNode(3);
        root.left = p;
        root.right = q;

        TreeNode pl = new TreeNode(6);
        TreeNode pr = new TreeNode(2);
        p.left = pl;
        p.right = pr;

        TreeNode prl = new TreeNode(7);
        TreeNode prr = new TreeNode(4);
        pr.left = prl;
        pr.right = prr;

        TreeNode ql = new TreeNode(0);
        TreeNode qr = new TreeNode(8);
        q.left = ql;
        q.right = qr;

        var node = problem.lowestCommonAncestor(root, p, prr);

        assertNotNull(node);
        assertEquals(5, node.val);
    }

    @Test
    void example3() {
        /*
        Input: root = [1,2], p = 1, q = 2
        Output: 1
         */
        TreeNode p = new TreeNode(2);
        TreeNode root = new TreeNode(1);
        root.left = p;

        var node = problem.lowestCommonAncestor(root, p, root);

        assertNotNull(node);
        assertEquals(1, node.val);
    }
}
