package dev.drf.leetcode.contiguous.array;

import dev.drf.leetcode.Problem;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/contiguous-array/
 * Used solution:
 * https://leetcode.com/problems/contiguous-array/solutions/1743431/a-highly-detailed-explanation-ever-exists-java-c
 */
public class ContiguousArrayProblem implements Problem {
    public int findMaxLength(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        int sum = 0;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                int last = map.get(sum);
                max = Math.max(max, i - last);
            } else {
                map.put(sum, i);
            }
        }
        return max;
    }
}
