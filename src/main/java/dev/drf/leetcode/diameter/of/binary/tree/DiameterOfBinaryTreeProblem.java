package dev.drf.leetcode.diameter.of.binary.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 * Used solution:
 * https://leetcode.com/problems/diameter-of-binary-tree/solutions/101132/java-solution-maxdepth/
 */
public class DiameterOfBinaryTreeProblem implements Problem {
    int max = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        maxDepth(root);
        return max;
    }

    private int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        max = Math.max(max, left + right);

        return Math.max(left, right) + 1;
    }
}
