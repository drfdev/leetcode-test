package dev.drf.leetcode.convert.sorted.array.to.binary.search.tree;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 */
public class ConvertSortedArrayToBinarySearchTreeProblem implements Problem {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        final int startIndex = 0;
        final int endIndex = nums.length - 1;
        return createTree(nums, startIndex, endIndex);
    }

    private TreeNode createTree(int[] nums, int startIndex, int endIndex) {
        if (startIndex > endIndex) {
            return null;
        }

        int middleIndex = (startIndex + endIndex) / 2;
        int value = nums[middleIndex];
        TreeNode node = new TreeNode(value);

        node.left = createTree(nums, startIndex, middleIndex - 1);
        node.right = createTree(nums, middleIndex + 1, endIndex);

        return node;
    }
}
