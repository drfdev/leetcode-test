package dev.drf.leetcode.path.sum.iii;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/path-sum-iii/
 * Used solution:
 * https://leetcode.com/problems/path-sum-iii/solutions/1525060/easy-solution-using-java-dfs-map/
 */
public class PathSumIIIProblem implements Problem {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }

        int leftCount = pathSum(root.left, targetSum);
        int rightCount = pathSum(root.right, targetSum);

        int currentCount = calculateResultForNode(root, 0, targetSum);

        return currentCount + leftCount + rightCount;
    }

    private int calculateResultForNode(TreeNode node, long currentCount, int targetSum) {
        if (node == null) {
            return 0;
        }

        int result = 0;
        currentCount += node.val;

        if (currentCount == targetSum) {
            result++;
        }

        int leftResult = calculateResultForNode(node.left, currentCount, targetSum);
        int rightResult = calculateResultForNode(node.right, currentCount, targetSum);

        return result + leftResult + rightResult;
    }
}
