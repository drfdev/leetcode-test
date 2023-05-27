package dev.drf.leetcode.leaf.similar.trees;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/leaf-similar-trees/
 */
public class LeafSimilarTreesProblem implements Problem {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if (root1 == null || root2 == null) {
            return false;
        }

        var values1 = new ArrayList<Integer>();
        var values2 = new ArrayList<Integer>();

        leafSequence(root1, values1);
        leafSequence(root2, values2);

        return values1.equals(values2);
    }

    private void leafSequence(TreeNode node, List<Integer> values) {
        if (node == null) {
            return;
        }
        if (isLeaf(node)) {
            values.add(node.val);
        }
        leafSequence(node.left, values);
        leafSequence(node.right, values);
    }

    private boolean isLeaf(TreeNode node) {
        return node.left == null && node.right == null;
    }
}
