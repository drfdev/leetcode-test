package dev.drf.leetcode.largest.number;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/largest-number/
 */
public class LargestNumberProblem implements Problem {
    public String largestNumber(int[] nums) {
        if (nums == null) {
            return null;
        }

        final int size = nums.length;
        List<String> strs = new ArrayList<>(size);
        for (int num : nums) {
            strs.add(String.valueOf(num));
        }

        strs.sort((o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        if (strs.get(0).equals("0")) {
            return "0";
        }

        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }
}
