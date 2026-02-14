package dev.drf.leetcode.find.elements.in.a.contaminated.binary.tree;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-elements-in-a-contaminated-binary-tree/
 */
public class FindElementsInAContaminatedBinaryTreeProblem implements Problem {
    public static class FindElements {
        private final Map<Integer, TreeNode> nodeMap = new HashMap<>();

        public FindElements(TreeNode root) {
            parseNode(root, 0);
        }

        public boolean find(int target) {
            return this.nodeMap.containsKey(target);
        }

        private void parseNode(TreeNode node, int value) {
            if (node == null) {
                return;
            }
            nodeMap.put(value, node);

            parseNode(node.left, (2 * value + 1));
            parseNode(node.right, (2 * value + 2));
        }
    }
}
