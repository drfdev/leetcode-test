package dev.drf.leetcode.binary.tree.zigzag.level.order.traversal;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
 */
public class BinaryTreeZigzagLevelOrderTraversalProblem implements Problem {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if (root == null) {
            return List.of();
        }

        List<List<Integer>> result = new ArrayList<>();

        Stack<TreeNode> leftToRight = new Stack<>();
        Stack<TreeNode> rightToLeft = new Stack<>();

        leftToRight.push(root);

        while (!leftToRight.isEmpty()
                || !rightToLeft.isEmpty()) {
            if (!leftToRight.isEmpty()) {
                List<Integer> toResult = new ArrayList<>();
                while (!leftToRight.isEmpty()) {
                    TreeNode node = leftToRight.pop();
                    if (node.left != null) {
                        rightToLeft.push(node.left);
                    }
                    if (node.right != null) {
                        rightToLeft.push(node.right);
                    }
                    toResult.add(node.val);
                }

                result.add(toResult);
            } else if (!rightToLeft.isEmpty()) {
                List<Integer> toResult = new ArrayList<>();
                while (!rightToLeft.isEmpty()) {
                    TreeNode node = rightToLeft.pop();
                    if (node.right != null) {
                        leftToRight.add(node.right);
                    }
                    if (node.left != null) {
                        leftToRight.add(node.left);
                    }
                    toResult.add(node.val);
                }

                result.add(toResult);
            }
        }

        return result;
    }
}
