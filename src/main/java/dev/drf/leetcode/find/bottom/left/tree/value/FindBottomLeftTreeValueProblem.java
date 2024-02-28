package dev.drf.leetcode.find.bottom.left.tree.value;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/find-bottom-left-tree-value/
 */
public class FindBottomLeftTreeValueProblem implements Problem {
    public int findBottomLeftValue(TreeNode root) {
        int[] res = new int[2];
        res[0] = 0;
        res[1] = root.val;

        searchLeftBottom(root, res, 1);

        return res[1];
    }

    private void searchLeftBottom(TreeNode node, int[] res, int deep) {
        if (node == null) {
            return;
        }

        int lastDeep = res[0];
        if (deep > lastDeep) {
            res[0] = deep;
            res[1] = node.val;
        }

        int nextDeep = deep + 1;
        searchLeftBottom(node.left, res, nextDeep);
        searchLeftBottom(node.right, res, nextDeep);
    }
}
