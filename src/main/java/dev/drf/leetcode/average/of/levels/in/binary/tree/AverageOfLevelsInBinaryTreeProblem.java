package dev.drf.leetcode.average.of.levels.in.binary.tree;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree
 */
public class AverageOfLevelsInBinaryTreeProblem implements Problem {
    public List<Double> averageOfLevels(TreeNode root) {
        Map<Integer, AvgState> levels = new HashMap<>();
        calculate(root, levels, 0);

        var entries = levels.entrySet();
        List<Double> result = new ArrayList<>(entries.size());

        for (Map.Entry<Integer, AvgState> entry : entries) {
            int level = entry.getKey();
            AvgState state = entry.getValue();

            double levelValue = state.sum / state.count;
            result.add(level, levelValue);
        }

        return result;
    }

    private void calculate(TreeNode node,
                           Map<Integer, AvgState> levels,
                           int level) {
        if (node == null) {
            return;
        }
        AvgState current = levels.computeIfAbsent(level, key -> new AvgState());
        current.sum += node.val;
        current.count++;

        int nextLevel = level + 1;
        calculate(node.left, levels, nextLevel);
        calculate(node.right, levels, nextLevel);
    }

    private static final class AvgState {
        private double sum = 0;
        private int count = 0;
    }
}
