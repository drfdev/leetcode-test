package dev.drf.leetcode.kth.smallest.element.in.a.bst;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/
 * I don't understand this task
 */
@Deprecated
public class KthSmallestElementInABstProblem implements Problem {
    public int kthSmallest(TreeNode root, int k) {
        Integer rootMinK = searchRootMinK(root, k, 1);
        return searchSmallest(root, rootMinK, k);
    }

    private Integer searchRootMinK(TreeNode node, int k, int index) {
        if (node == null) {
            return null;
        }
        if (index == k) {
            return node.val;
        }

        Integer leftMin = searchRootMinK(node.left, k, index + 1);
        Integer rightMin = searchRootMinK(node.right, k, index + 1);

        return minWithNulls(leftMin, rightMin);
    }

    private Integer minWithNulls(Integer leftMin, Integer rightMin) {
        if (leftMin != null && rightMin != null) {
            return Math.min(leftMin, rightMin);
        }
        return leftMin == null ? rightMin : leftMin;
    }

    private Integer searchSmallest(TreeNode node, Integer min, int k) {
        if (node == null) {
            return min;
        }

        Integer leftMin = searchRootMinK(node.left, k, 1);
        Integer rightMin = searchRootMinK(node.right, k, 1);

        Integer subNodesMin = minWithNulls(leftMin, rightMin);
        return minWithNulls(min, subNodesMin);
    }
}
