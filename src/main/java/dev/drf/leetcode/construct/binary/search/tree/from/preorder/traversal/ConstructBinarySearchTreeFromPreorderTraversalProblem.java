package dev.drf.leetcode.construct.binary.search.tree.from.preorder.traversal;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
 */
public class ConstructBinarySearchTreeFromPreorderTraversalProblem implements Problem {
    private int index = 0;

    public TreeNode bstFromPreorder(int[] preorder) {
        this.index = 0;
        return processNextNode(preorder, Integer.MAX_VALUE);
    }

    private TreeNode processNextNode(int[] preorder,
                                     int bound) {
        if (index >= preorder.length
                || preorder[index] > bound) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[index++]);
        node.left = processNextNode(preorder, node.val);
        node.right = processNextNode(preorder, bound);
        return node;
    }
}
