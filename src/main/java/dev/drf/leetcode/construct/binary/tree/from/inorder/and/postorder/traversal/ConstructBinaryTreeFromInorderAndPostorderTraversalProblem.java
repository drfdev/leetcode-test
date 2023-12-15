package dev.drf.leetcode.construct.binary.tree.from.inorder.and.postorder.traversal;

import dev.drf.leetcode.Problem;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 * Used solution:
 * https://www.youtube.com/watch?v=vm63HuIU7kw
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversalProblem implements Problem {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        AtomicInteger postorderIndex = new AtomicInteger(postorder.length - 1);
        return buildNode(inorder, postorder, postorderIndex);
    }

    private TreeNode buildNode(int[] inorder,
                               int[] postorder,
                               AtomicInteger postorderIndex) {
        if (inorder.length == 0 || postorderIndex.get() < 0) {
            return null;
        }

        int postorderValue = postorder[postorderIndex.getAndDecrement()];
        TreeNode node = new TreeNode(postorderValue);

        int index = -1;
        for (int i = 0; i < inorder.length; i++) {
            var inorderValue = inorder[i];
            if (postorderValue == inorderValue) {
                index = i;
                break;
            }
        }

        node.right =
                buildNode(
                        Arrays.copyOfRange(inorder, index + 1, inorder.length),
                        postorder,
                        postorderIndex
                );
        node.left =
                buildNode(
                        Arrays.copyOfRange(inorder, 0, index),
                        postorder,
                        postorderIndex
                );

        return node;
    }
}
