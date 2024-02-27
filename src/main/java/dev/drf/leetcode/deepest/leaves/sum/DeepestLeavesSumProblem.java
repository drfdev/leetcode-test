package dev.drf.leetcode.deepest.leaves.sum;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/deepest-leaves-sum/
 */
public class DeepestLeavesSumProblem implements Problem {
    public int deepestLeavesSum(TreeNode root) {
        Map<Integer, Integer> leavesSum = new HashMap<>();
        calculateLeavesSum(root, leavesSum, 0);
        Integer maxDeep = leavesSum.keySet()
                .stream()
                .max(Integer::compareTo)
                .orElse(-1);
        if (maxDeep == -1) {
            return 0;
        }
        return leavesSum.get(maxDeep);
    }

    private void calculateLeavesSum(TreeNode node,
                                    Map<Integer, Integer> leavesSum,
                                    int deep) {
        if (node == null) {
            return;
        }
        if (isLeaf(node)) {
            leavesSum.merge(deep, node.val, Integer::sum);
        } else {
            int nextDeep = (deep + 1);
            calculateLeavesSum(node.left, leavesSum, nextDeep);
            calculateLeavesSum(node.right, leavesSum, nextDeep);
        }
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
