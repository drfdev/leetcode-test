package dev.drf.leetcode.balance.a.binary.search.tree;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * https://leetcode.com/problems/balance-a-binary-search-tree/
 * beats 5.43%, lol
 */
public class BalanceABinarySearchTreeProblem implements Problem {
    public TreeNode balanceBST(TreeNode root) {
        // get nodes
        List<TreeNode> nodes = new ArrayList<>();
        loadAndClearNodes(nodes, root);

        // sort nodes
        nodes.sort(Comparator.comparingInt(node -> node.val));

        // build tree
        return buildSubTree(nodes, 0, nodes.size() - 1);
    }

    private void loadAndClearNodes(List<TreeNode> nodes,
                                   TreeNode node) {
        if (node == null) {
            return;
        }

        nodes.add(node);
        loadAndClearNodes(nodes, node.left);
        loadAndClearNodes(nodes, node.right);

        node.left = null;
        node.right = null;
    }

    private TreeNode buildSubTree(List<TreeNode> nodes,
                                  int firstIndex,
                                  int lastIndex) {
        if (firstIndex > lastIndex) {
            return null;
        }
        if (firstIndex == lastIndex) {
            return nodes.get(firstIndex);
        }
        // odd / even
        // [1, 2, 3, 4] -- 4, center = 2
        // [1, 2, 3, 4, 5] -- 5, center = 3
        final int length = (lastIndex - firstIndex) + 1;
        final boolean isEven = length % 2 == 0;
        final int centralIndex = isEven
                ? (firstIndex + lastIndex - 1) / 2
                : (firstIndex + lastIndex) / 2;

        TreeNode node = nodes.get(centralIndex);
        node.left = buildSubTree(nodes, firstIndex, centralIndex - 1);
        node.right = buildSubTree(nodes, centralIndex + 1, lastIndex);

        return node;
    }
}
