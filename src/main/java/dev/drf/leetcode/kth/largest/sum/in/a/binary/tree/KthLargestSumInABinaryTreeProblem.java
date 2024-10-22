package dev.drf.leetcode.kth.largest.sum.in.a.binary.tree;

import dev.drf.leetcode.Problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/kth-largest-sum-in-a-binary-tree/
 */
public class KthLargestSumInABinaryTreeProblem implements Problem {
    public long kthLargestLevelSum(TreeNode root, int k) {
        var sumMap = new HashMap<Integer, Long>();
        calculateSumByLevel(sumMap, root, 1);

        Map.Entry<Integer, Long>[] keys = sumMap.entrySet()
                .toArray(Map.Entry[]::new);
        Arrays.sort(keys, (e1, e2) -> {
            var value1 = e1.getValue();
            var value2 = e2.getValue();

            return Long.compare(value2, value1);
        });

        if (k <= keys.length) {
            var key = keys[k - 1];
            return sumMap.get(key.getKey());
        }

        return -1;
    }

    private void calculateSumByLevel(Map<Integer, Long> sumMap,
                                     TreeNode node,
                                     int level) {
        if (node == null) {
            return;
        }

        long levelSum = sumMap.getOrDefault(level, 0L);
        levelSum = levelSum + node.val;
        sumMap.put(level, levelSum);

        calculateSumByLevel(sumMap, node.left, level + 1);
        calculateSumByLevel(sumMap, node.right, level + 1);
    }
}
