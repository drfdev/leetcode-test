package dev.drf.leetcode.maximum.binary.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/maximum-binary-tree/
 */
public class MaximumBinaryTreeProblem implements Problem {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums,
                               int leftIndex,
                               int rightIndex) {
        if (leftIndex > rightIndex) {
            return null;
        }
        if (leftIndex == rightIndex) {
            return new TreeNode(nums[leftIndex]);
        }

        final int maxIndex = findMax(nums, leftIndex, rightIndex);
        TreeNode node = new TreeNode(nums[maxIndex]);

        if (leftIndex < maxIndex) {
            TreeNode leftNode = buildTree(nums, leftIndex, maxIndex - 1);
            node.left = leftNode;
        }

        if (maxIndex < rightIndex) {
            TreeNode rightNode = buildTree(nums, maxIndex + 1, rightIndex);
            node.right = rightNode;
        }

        return node;
    }

    private int findMax(int[] nums,
                        int leftIndex,
                        int rightIndex) {
        int maxIndex = leftIndex;
        int value = nums[leftIndex];
        for (int i = leftIndex + 1; i <= rightIndex; i++) {
            int current = nums[i];
            if (value < current) {
                maxIndex = i;
                value = current;
            }
        }
        return maxIndex;
    }
}
