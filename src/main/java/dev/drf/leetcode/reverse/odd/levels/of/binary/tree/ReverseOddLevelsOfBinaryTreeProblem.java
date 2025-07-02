package dev.drf.leetcode.reverse.odd.levels.of.binary.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/reverse-odd-levels-of-binary-tree/
 */
public class ReverseOddLevelsOfBinaryTreeProblem implements Problem {
    public TreeNode reverseOddLevels(TreeNode root) {
        swapRecursively(root.left, root.right, true);
        return root;
    }

    private void swapRecursively(TreeNode left,
                                 TreeNode right,
                                 final boolean odd) {
        if (left == null || right == null) {
            return;
        }

        if (odd) {
            int leftVal = left.val;
            left.val = right.val;
            right.val = leftVal;
        }

        final boolean nextOdd = !odd;
        swapRecursively(left.left, right.right, nextOdd);
        swapRecursively(left.right, right.left, nextOdd);
    }
}
