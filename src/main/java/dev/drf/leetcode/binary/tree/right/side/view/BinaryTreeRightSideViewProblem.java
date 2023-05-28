package dev.drf.leetcode.binary.tree.right.side.view;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-right-side-view/
 */
public class BinaryTreeRightSideViewProblem implements Problem {
    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }

        List<Integer> values = new ArrayList<>();
        fillRightValues(root, values, 1);
        return values;
    }

    private int fillRightValues(TreeNode node, List<Integer> values, int depth) {
        if (node == null) {
            return depth;
        }

        if (depth > values.size()) {
            values.add(node.val);
        }

        int rightDepth = fillRightValues(node.right, values, depth + 1);
        int leftDepth = fillRightValues(node.left, values, depth + 1);

        return Math.max(rightDepth, leftDepth);
    }
}
