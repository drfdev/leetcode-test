package dev.drf.leetcode.count.pairs.whose.sum.is.less.than.target;

import dev.drf.leetcode.Problem;

import java.util.List;

/**
 * https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/
 * Used solution:
 * https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/solutions/3933451/two-pointers-approach-easy-to-understand-in-9-languages/
 */
public class CountPairsWhoseSumIsLessThanTargetProblem implements Problem {
    public int countPairs(List<Integer> nums, int target) {
        if (nums == null || nums.isEmpty()) {
            return 0;
        }

        nums.sort(null);
        final int size = nums.size();
        int count = 0;

        int leftIndex = 0;
        int rightIndex = size - 1;
        while (leftIndex < rightIndex) {
            int left = nums.get(leftIndex);
            int right = nums.get(rightIndex);

            int sum = left + right;
            if (sum < target) {
                count += rightIndex - leftIndex;
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        return count;
    }
}
