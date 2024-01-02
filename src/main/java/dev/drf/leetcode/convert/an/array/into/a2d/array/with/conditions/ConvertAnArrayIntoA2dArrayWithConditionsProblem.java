package dev.drf.leetcode.convert.an.array.into.a2d.array.with.conditions;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
 */
public class ConvertAnArrayIntoA2dArrayWithConditionsProblem implements Problem {
    public List<List<Integer>> findMatrix(int[] nums) {
        Arrays.sort(nums);

        int lastNum = nums[0];
        int len = -1;

        List<List<Integer>> result = new ArrayList<>();

        for (int num : nums) {
            if (lastNum == num) {
                len++;
                if (result.size() <= len) {
                    result.add(new ArrayList<>());
                }
            } else {
                len = 0;
                lastNum = num;
            }

            List<Integer> listToAdd = result.get(len);
            listToAdd.add(num);
        }

        return result;
    }
}
