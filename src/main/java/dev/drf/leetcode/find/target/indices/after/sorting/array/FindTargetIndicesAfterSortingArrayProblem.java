package dev.drf.leetcode.find.target.indices.after.sorting.array;

import dev.drf.leetcode.Problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/find-target-indices-after-sorting-array/description
 */
public class FindTargetIndicesAfterSortingArrayProblem implements Problem {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);

        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = nums[mid];

            if (midVal < target) {
                low = mid + 1;
            } else if (midVal > target) {
                high = mid - 1;
            } else {
                // find
                var result = new ArrayList<Integer>();
                result.add(mid);
                if (mid > 0 ) {
                    for (int i = mid - 1; i >= 0; i--) {
                        if (nums[i] == target) {
                            result.add(i);
                        } else {
                            break;
                        }
                    }
                }
                if (mid < high) {
                    for (int i = mid + 1; i <= high; i++) {
                        if (nums[i] == target) {
                            result.add(i);
                        } else {
                            break;
                        }
                    }
                }

                result.sort(Integer::compareTo);
                return result;
            }
        }

        return List.of();
    }
}
