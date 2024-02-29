package dev.drf.leetcode.even.odd.tree;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/even-odd-tree/
 */
public class EvenOddTreeProblem implements Problem {
    public boolean isEvenOddTree(TreeNode root) {
        Map<Integer, Integer> levels = new HashMap<>();
        return nodeLevel(root, levels, 0);
    }

    private boolean nodeLevel(TreeNode node,
                              Map<Integer, Integer> levels,
                              int depth) {
        if (node == null) {
            return true;
        }

        final int value = node.val;
        final boolean isEven = depth % 2 == 0;
        final boolean isValueEven = value % 2 == 0;

        if (isEven == isValueEven) {
            return false;
        }

        if (levels.containsKey(depth)) {
            int prevValue = levels.get(depth);
            if (isEven) {
                // For every even-indexed level, all nodes at the level have
                // odd integer values in strictly increasing order (from left to right).
                if (!(prevValue < value)) {
                    return false;
                }
            } else {
                // For every odd-indexed level, all nodes at the level have
                // even integer values in strictly decreasing order (from left to right).
                if (!(prevValue > value)) {
                    return false;
                }
            }
        }
        levels.put(depth, value);
        final int nextDepth = depth + 1;

        boolean leftCheck = nodeLevel(node.left, levels, nextDepth);
        if (!leftCheck) {
            return false;
        }
        boolean rightCheck = nodeLevel(node.right, levels, nextDepth);
        if (!rightCheck) {
            return false;
        }

        return true;
    }
}
