package dev.drf.leetcode.path.sum.ii;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/path-sum-ii/
 */
public class PathSumIIProblem implements Problem {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return List.of();
        }

        List<List<Integer>> result = new ArrayList<>();
        searchByNode(result, root, targetSum, 0, List.of());
        return result;
    }

    private void searchByNode(List<List<Integer>> result, TreeNode node, int targetSum, int currentSum, List<Integer> values) {
        if (node == null) {
            return;
        }

        int nodeSum = currentSum + node.val;
        if (node.left == null && node.right == null) {
            if (nodeSum == targetSum) {
                List<Integer> vals = new ArrayList<>(values);
                vals.add(node.val);
                result.add(vals);
            }
            return;
        }

        List<Integer> nextList = new ArrayList<>(values);
        nextList.add(node.val);

        if (node.left != null) {
            searchByNode(result, node.left, targetSum, nodeSum, nextList);
        }
        if (node.right != null) {
            searchByNode(result, node.right, targetSum, nodeSum, nextList);
        }
    }
}
