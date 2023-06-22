package dev.drf.leetcode.binary.tree.level.order.traversal;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/
 */
public class BinaryTreeLevelOrderTraversalProblem implements Problem {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        buildLevels(levels, root, 0);
        return levels;
    }

    private void buildLevels(List<List<Integer>> levels, TreeNode node, int index) {
        if (node == null) {
            return;
        }

        if (levels.size() == index) {
            levels.add(new ArrayList<>());
        }

        List<Integer> currentLevel = levels.get(index);
        currentLevel.add(node.val);

        buildLevels(levels, node.left, index + 1);
        buildLevels(levels, node.right, index + 1);
    }
}
