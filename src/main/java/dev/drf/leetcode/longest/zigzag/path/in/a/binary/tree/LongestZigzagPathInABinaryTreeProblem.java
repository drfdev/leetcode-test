package dev.drf.leetcode.longest.zigzag.path.in.a.binary.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/longest-zigzag-path-in-a-binary-tree/
 */
public class LongestZigzagPathInABinaryTreeProblem implements Problem {
    public int longestZigZag(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int maxLeft = maxZigZag(root.left, Side.LEFT, 0);
        int maxRight = maxZigZag(root.right, Side.RIGHT, 0);

        return Math.max(maxLeft, maxRight);
    }

    private int maxZigZag(TreeNode node, Side side, int length) {
        if (node == null) {
            return length;
        }
        int leftZigZag = side == Side.LEFT
//                ? longestZigZag(node.left)
                ? maxZigZag(node.left, Side.LEFT, 0)
                : maxZigZag(node.left, Side.LEFT, length + 1);
        int rightZigZag = side == Side.RIGHT
//                ? longestZigZag(node.right)
                ? maxZigZag(node.right, Side.RIGHT, 0)
                : maxZigZag(node.right, Side.RIGHT, length + 1);

        return Math.max(leftZigZag, rightZigZag);
    }

    public enum Side {
        LEFT, RIGHT
    }
}
