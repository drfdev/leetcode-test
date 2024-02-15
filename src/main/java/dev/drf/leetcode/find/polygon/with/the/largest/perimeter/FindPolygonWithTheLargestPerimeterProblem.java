package dev.drf.leetcode.find.polygon.with.the.largest.perimeter;

import dev.drf.leetcode.Problem;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/
 * Used solution:
 * https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/solutions/4729097/beats-100-c-java-python-javascript-2-approaches-explained/
 */
public class FindPolygonWithTheLargestPerimeterProblem implements Problem {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        long sum = 0;
        long ans = -1;

        for (int num : nums) {
            if (num < sum) {
                ans = num + sum;
            }
            sum += num;
        }

        return ans;
    }
}
