package dev.drf.leetcode.create.binary.tree.from.descriptions;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/create-binary-tree-from-descriptions/
 */
public class CreateBinaryTreeFromDescriptionsProblem implements Problem {
    public TreeNode createBinaryTree(int[][] descriptions) {
        final var childSet = new HashSet<Integer>(descriptions.length);
        final var map = new HashMap<Integer, TreeNode>(descriptions.length);

        for (int[] description : descriptions) {
            int parent = description[0];
            int child = description[1];
            boolean isLeft = description[2] == 1;

            TreeNode parentNode = map.get(parent);
            if (parentNode == null) {
                parentNode = new TreeNode(parent);
                map.put(parent, parentNode);
            }

            TreeNode childNode = map.get(child);
            if (childNode == null) {
                childNode = new TreeNode(child);
                map.put(child, childNode);
            }
            childSet.add(child);

            if (isLeft) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }
        }

        TreeNode root = null;
        var nodeKeys = map.keySet();
        for (Integer nodeKey : nodeKeys) {
            if (!childSet.contains(nodeKey)) {
                root = map.get(nodeKey);
            }
        }
        return root;
    }
}
