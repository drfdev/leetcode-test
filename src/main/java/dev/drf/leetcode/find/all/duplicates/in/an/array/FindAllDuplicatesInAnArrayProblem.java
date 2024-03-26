package dev.drf.leetcode.find.all.duplicates.in.an.array;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */
public class FindAllDuplicatesInAnArrayProblem implements Problem {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> numSet = new HashSet<>();

        for (int num : nums) {
            if (numSet.contains(num)) {
                result.add(num);
            } else {
                numSet.add(num);
            }
        }

        return result;
    }
}
