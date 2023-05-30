package dev.drf.leetcode.daily.temperatures;

import dev.drf.leetcode.Problem;

import java.util.Deque;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/daily-temperatures/
 * Used solution:
 * https://leetcode.com/problems/daily-temperatures/solutions/109832/java-easy-ac-solution-with-stack/
 */
public class DailyTemperaturesProblem implements Problem {
    public int[] dailyTemperatures(int[] temperatures) {
        int size = temperatures.length;
        int[] result = new int[size];

        Deque<Integer> stack = new LinkedList<>();

        for (int i = 0; i < size; i++) {
            while (!stack.isEmpty()
                    && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                result[idx] = i - idx;
            }
            stack.push(i);
        }

        return result;
    }
}
