package dev.drf.leetcode.xor.queries.of.a.subarray;

import dev.drf.leetcode.Problem;

/**
 * https://leetcode.com/problems/xor-queries-of-a-subarray/
 * Used solution:
 * https://leetcode.com/problems/xor-queries-of-a-subarray/solutions/5778700/beats-100-explained-with-video-c-java-python-js-prefix-xor-explained-in-detail/
 */
public class XorQueriesOfASubarrayProblem implements Problem {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        int[] cache = new int[arr.length];
        cache[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            cache[i] = cache[i - 1] ^ arr[i];
        }

        for (int i = 0; i < queries.length; i++) {
            var query = queries[i];
            int leftIndex = query[0];
            int rightIndex = query[1];

            if (leftIndex == 0) {
                answer[i] = cache[rightIndex];
            } else {
                answer[i] = cache[rightIndex] ^ cache[leftIndex - 1];
            }
        }

        return answer;
    }
}
