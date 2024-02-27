package dev.drf.leetcode.range.sum.of.bst;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/range-sum-of-bst/
 */
public class RangeSumOfBstProblem implements Problem {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;
        }
        final int nodeValue = root.val;
        int sum = 0;
        if (low <= nodeValue && nodeValue <= high) {
            sum += nodeValue;
        }

        sum += rangeSumBST(root.left, low, high);
        sum += rangeSumBST(root.right, low, high);

        return sum;
    }
}
