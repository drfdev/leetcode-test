package dev.drf.leetcode.sum.of.subarray.minimums;

import java.util.Stack;

/**
 * https://leetcode.com/problems/sum-of-subarray-minimums/
 * Used solution:
 * https://leetcode.com/problems/sum-of-subarray-minimums/solutions/4595210/beats-99-08-users-c-java-python-javascript-explained/
 */
public class SumOfSubarrayMinimumsProblem2 {
    public int sumSubarrayMins(int[] arr) {
        final int mod = 1000000007;
        Stack<Integer> stack = new Stack<>();
        long sum = 0;

        for (int i = 0; i <= arr.length; i++) {
            while (!stack.empty()
                    && (i == arr.length || arr[stack.peek()] >= arr[i])) {
                int mid = stack.pop();
                int leftBoundary = stack.empty() ? -1 : stack.peek();
                int rightBoundary = i;

                long count = (mid - leftBoundary) * (rightBoundary - mid) % mod;

                sum += (count * arr[mid]) % mod;
                sum %= mod;
            }
            stack.push(i);
        }

        return (int) sum;
    }
}
