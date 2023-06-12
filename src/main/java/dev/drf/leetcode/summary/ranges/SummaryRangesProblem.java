package dev.drf.leetcode.summary.ranges;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/summary-ranges/
 */
public class SummaryRangesProblem implements Problem {
    public List<String> summaryRanges(int[] nums) {
        if (nums == null) {
            return List.of();
        }
        if (nums.length == 0) {
            return List.of();
        }

        List<String> list = new ArrayList<>();

        int pr = nums[0];
        int start = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int value = nums[i];
            if (value == (pr + 1)) {
                pr = value;
            } else {
                if (start == pr) {
                    list.add("" + start);
                } else {
                    list.add(start + "->" + pr);
                }

                start = value;
                pr = value;
            }
        }

        // last iteration
        if (start == pr) {
            list.add("" + start);
        } else {
            list.add(start + "->" + pr);
        }

        return list;
    }
}
